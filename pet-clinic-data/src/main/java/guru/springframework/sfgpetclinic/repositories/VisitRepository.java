package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository class for <code>Visit</code> domain objects.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
