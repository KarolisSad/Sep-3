package via.sep3.group11.tier2.CommunicationInterfaces;


import via.sep3.group11.tier2.shared.domain.Housing;
import via.sep3.group11.tier2.shared.exceptions.ValidationException;

import java.util.List;
import java.util.Optional;

public interface HousingCommunicationInterface {
    Housing addHousing(Housing housing, String email) throws ValidationException;
    List<Housing> getAvailableHousing() throws ValidationException;
    void removeHousing(long housingId);
    Optional<Housing> getHousingById(long housingId) throws ValidationException;
    Housing updateHousing (Housing housing) throws ValidationException;
}
