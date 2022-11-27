package via.sep3.group11.tier2.daoInterfaces;

import via.sep3.group11.tier2.shared.domain.Refugee;

import java.util.Optional;

public interface RefugeeDaoInterface {
    Refugee createRefugee(Refugee refugee);
    Optional<Refugee> getRefugeeByEmail(String email);
}
