package via.sep3.group11.tier3.DAO.DAOImplementations;

import org.springframework.stereotype.Service;
import via.sep3.group11.tier3.model.Address;
import via.sep3.group11.tier3.model.Agreement;
import via.sep3.group11.tier3.model.Host;
import via.sep3.group11.tier3.model.Housing;
import via.sep3.group11.tier3.repository.AddressRepository;
import via.sep3.group11.tier3.repository.HostRepository;
import via.sep3.group11.tier3.repository.HousingRepository;
import via.sep3.group11.tier3.DAO.DAOInterfaces.HousingDaoInterface;

import java.util.List;
import java.util.Optional;

/**
 * A class that implements housingDaoInterface
 * and initializes HousingRepository in order to manipulate
 * the database on the housing table.
 * In the class Service annotation is used in order to mark the class as
 * service provider for some business functionality.
 *
 * @version 28/11/22
 * @author Group 11
 */
@Service
public class HousingDAOImplementation implements HousingDaoInterface {

    private HousingRepository repository;
    private AddressRepository addressRepository;
    private HostRepository hostRepository;

    /**
     * Constructor to initialize repository class
     * @param repository housing repository
     */
    public HousingDAOImplementation(HousingRepository repository, AddressRepository addressRepository, HostRepository hostRepository) {
        this.repository = repository;
        this.addressRepository = addressRepository;
        this.hostRepository = hostRepository;
    }

    /**
     * Method that creates new address object in the database,
     * using JpaRepository (CrudRepository) method
     * @param housing housing object
     * @param email id
     * @return created housing object
     */
    @Override
    public Housing addHousing(Housing housing, String email) {
        Address a = housing.getAddress();
        addressRepository.save(a);

        Housing toAdd = housing;
        Optional<Host> host = hostRepository.findById(email);

        if (host.isPresent()) {
            toAdd.host = host.get();
            return repository.save(toAdd);
        }

        return null;
    }


    @Override
    public Optional<Housing> getHousingById(long housingId) {
        return repository.findById(housingId);
    }

    @Override
    public Housing updateHousing(Housing housing) {
        // If there exists housing i DB with same id as the updated version given as argument..
        if (repository.findById(housing.getHousingId()).isPresent()) {

            // save updated version in db WITH SAME id as original (overwrite)
            return repository.save(housing);
        }

        // If NOT FOUND return null (maybe do sth else??)
        return null;
    }


    //TODO seems to work - but test when changing status!!
    @Override
    public List<Housing> getAvailableHousing() {
        List<Housing> availableHousing = repository.findAllByAvailableTrue();

        return availableHousing;
    }

    @Override
    public void removeHousing(long housingId) {
        repository.deleteById(housingId);
    }
}
