package via.sep3.group11.tier2.daoImplementation;

import io.grpc.StatusRuntimeException;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.context.annotation.Configuration;
import via.sep3.group11.tier2.daoImplementation.connections.Channel;
import via.sep3.group11.tier2.daoImplementation.converters.GrpcConverter;
import via.sep3.group11.tier2.daoInterfaces.RefugeeDaoInterface;
import via.sep3.group11.tier2.protobuf.GEmail;
import via.sep3.group11.tier2.protobuf.GRefugee;
import via.sep3.group11.tier2.shared.domain.Refugee;
import via.sep3.group11.tier2.shared.exceptions.ValidationException;

import javax.annotation.Resource;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@GRpcService
public class RefugeeDaoImpl implements RefugeeDaoInterface {

    @Resource
    Channel channel;

    @Override
    public Refugee CreateRefugee(Refugee refugee) throws ValidationException {
        try {
            GRefugee request = GrpcConverter.RefugeeToGrpc(refugee);
            GRefugee response = channel.getRefugeeStub().withDeadlineAfter(1, TimeUnit.SECONDS).createRefugee(request);
            if (response.getEmail().isEmpty())
            {
                return null;
            }
            return GrpcConverter.RefugeeFromGrpc(response);
        }
        catch (StatusRuntimeException e)
        {
            reestablishConnection();
            return null;
        }
    }

    @Override
    public Optional<Refugee> GetRefugeeByEmail(String email) throws ValidationException {
        try {
            GEmail request = GEmail.newBuilder().setEmail(email).build();
            GRefugee response = channel.getRefugeeStub().withDeadlineAfter(1, TimeUnit.SECONDS).getRefugeeByEmail(request);
            return Optional.of(GrpcConverter.RefugeeFromGrpc(response));
        }
        catch (StatusRuntimeException e)
        {
            reestablishConnection();
            return null;
        }
    }

    private void reestablishConnection() {
        channel.CreateChannel();
    }
}