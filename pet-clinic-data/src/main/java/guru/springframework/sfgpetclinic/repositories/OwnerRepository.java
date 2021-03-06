package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository class for <code>Owner</code> domain objects.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    /**
     * Returns the Owner entity with that last name.
     * @param lastName
     * @return Owner entity.
     */
    Owner findByLastName(String lastName);
}
