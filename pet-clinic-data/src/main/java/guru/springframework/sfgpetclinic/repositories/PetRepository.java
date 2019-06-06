package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository class for <code>Pet</code> domain objects.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
