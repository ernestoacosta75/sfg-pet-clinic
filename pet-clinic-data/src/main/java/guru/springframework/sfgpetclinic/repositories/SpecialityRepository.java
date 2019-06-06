package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository class for <code>Speciality</code> domain objects.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
