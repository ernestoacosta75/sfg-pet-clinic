package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository class for <code>Vet</code> domain objects.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
