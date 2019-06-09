package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Service class for <code>PetType</code> domain objects.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    /**
     * Returns a set of all <code>PetType</code> entities.
     * @return PetType's set entities.
     */
    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypeSet = new HashSet<PetType>();
        this.petTypeRepository.findAll().forEach(petTypeSet::add);

        return petTypeSet;
    }

    /**
     * Return the <code>PetType</code> entity with that ID. Otherwise, returns null.
     * @param aLong
     * @return PetType entity or null.
     */
    @Override
    public PetType findById(Long aLong) {
        return this.petTypeRepository.findById(aLong).orElse(null);
    }

    /**
     * Returns the <code>PetType</code> entity saved.
     * @param petType
     * @return PetType entity saved
     */
    @Override
    public PetType save(PetType petType) {
        return this.petTypeRepository.save(petType);
    }

    /**
     * Delete that <code>PetType</code> entity.
     * @param petType
     */
    @Override
    public void delete(PetType petType) {
        this.petTypeRepository.delete(petType);
    }

    /**
     * Delete an <code>PetType</code> entity with that ID.
     * @param aLong
     */
    @Override
    public void deleteById(Long aLong) {
        this.petTypeRepository.deleteById(aLong);
    }
}
