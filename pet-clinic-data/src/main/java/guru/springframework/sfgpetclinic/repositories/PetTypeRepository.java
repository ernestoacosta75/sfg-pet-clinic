package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository class for <code>PetType</code> domain objects.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
