package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repositories.SpecialityRepository;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Service class for <code>Speciality</code> domain objects.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecialitySDJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    /**
     * Returns a set of all <code>Speciality</code> entities.
     * @return Speciality's set entities.
     */
    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialitySet = new HashSet<Speciality>();
        this.specialityRepository.findAll().forEach(specialitySet::add);

        return specialitySet;
    }

    /**
     * Return the <code>Speciality</code> entity with that ID. Otherwise, returns null.
     * @param aLong
     * @return Speciality entity or null.
     */
    @Override
    public Speciality findById(Long aLong) {
        return this.specialityRepository.findById(aLong).orElse(null);
    }

    /**
     * Returns the <code>Speciality</code> entity saved.
     * @param speciality
     * @return Pet entity saved
     */
    @Override
    public Speciality save(Speciality speciality) {
        return this.specialityRepository.save(speciality);
    }

    /**
     * Delete that <code>Speciality</code> entity.
     * @param speciality
     */
    @Override
    public void delete(Speciality speciality) {
        this.specialityRepository.delete(speciality);
    }

    /**
     * Delete an <code>Speciality</code> entity with that ID.
     * @param aLong
     */
    @Override
    public void deleteById(Long aLong) {
        this.specialityRepository.deleteById(aLong);
    }
}
