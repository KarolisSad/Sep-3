package via.sep3.group11.tier2.GrpcClients;

import io.grpc.StatusRuntimeException;
import org.lognet.springboot.grpc.GRpcService;
import via.sep3.group11.tier2.GrpcClients.connections.Channel;
import via.sep3.group11.tier2.GrpcClients.converters.GrpcConverter;
import via.sep3.group11.tier2.CommunicationInterfaces.HousingCommunicationInterface;
import via.sep3.group11.tier2.protobuf.*;
import via.sep3.group11.tier2.shared.domain.Agreement;
import via.sep3.group11.tier2.shared.domain.Housing;
import via.sep3.group11.tier2.shared.exceptions.ValidationException;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@GRpcService
public class HousingGrpcClient implements HousingCommunicationInterface {

    @Resource
    Channel channel;

    @Override
    public Housing addHousing(Housing housing, String email) throws ValidationException {
        try {
            GAddHousingRequest request = GrpcConverter.addHousingRequest(housing, email);
            GHousing response = channel.getHousingStub().withDeadlineAfter(1, TimeUnit.SECONDS).addHousing(request);
            return GrpcConverter.housingFromGrpc(response);
        }
        catch (StatusRuntimeException e)
        {
            reestablishConnection();
            return null;
        }
    }

    @Override
    public List<Housing> getAvailableHousing() {
        return null;
    }

    @Override
    public void removeHousing(long housingId) {
        try {
            GId request = GId.newBuilder().setId(housingId).build();
            channel.getHousingStub().withDeadlineAfter(1, TimeUnit.SECONDS).removeHousing(request);
        }
        catch (StatusRuntimeException e)
        {
            reestablishConnection();
        }
    }

    @Override
    public Optional<Housing> getHousingById(long housingId) throws ValidationException{
        try {
            GId request = GId.newBuilder().setId(housingId).build();
            GHousing response = channel.getHousingStub().withDeadlineAfter(1, TimeUnit.SECONDS).getHousingById(request);
            if (response == null)
            {
                return Optional.empty();
            }
            return Optional.of(GrpcConverter.housingFromGrpc(response));
        }
        catch (StatusRuntimeException e)
        {
            reestablishConnection();
            return null;
        }
    }

    @Override
    public Housing updateHousing(Housing housing) throws ValidationException{
        try {
            GHousing request = GHousing.newBuilder().build();
            GHousing response = channel.getHousingStub().withDeadlineAfter(1, TimeUnit.SECONDS).updateHousing(request);
            if (response.equals(housing))
            {
                return housing;
            }
            return GrpcConverter.housingFromGrpc(response);
        }
        catch (StatusRuntimeException e)
        {
            reestablishConnection();
            return null;
        }
    }

    public void reestablishConnection() {
        channel.createChannel();
    }

}
