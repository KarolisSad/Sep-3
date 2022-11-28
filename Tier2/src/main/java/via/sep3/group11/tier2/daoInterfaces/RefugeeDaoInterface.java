package via.sep3.group11.tier2.daoInterfaces;


import via.sep3.group11.tier2.shared.domain.Refugee;
import via.sep3.group11.tier2.shared.exceptions.ValidationException;

import java.util.Optional;

public interface RefugeeDaoInterface {
    Refugee CreateRefugee(Refugee refugee) throws ValidationException;
    Optional<Refugee> GetRefugeeByEmail(String email) throws ValidationException;
}
