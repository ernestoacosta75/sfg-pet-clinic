package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Service class for <code>Pet</code> domain objects.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {

    private final PetRepository petRepository;

    public PetSDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    /**
     * Returns a set of all <code>Pet</code> entities.
     * @return Pet's set entities.
     */
    @Override
    public Set<Pet> findAll() {
        Set<Pet> petSet = new HashSet<Pet>();
        this.petRepository.findAll().forEach(petSet::add);

        return petSet;
    }

    /**
     * Return the <code>Pet</code> entity with that ID. Otherwise, returns null.
     * @param aLong
     * @return Pet entity or null.
     */
    @Override
    public Pet findById(Long aLong) {
        return this.petRepository.findById(aLong).orElse(null);
    }

    /**
     * Returns the <code>Pet</code> entity saved.
     * @param pet
     * @return Pet entity saved
     */
    @Override
    public Pet save(Pet pet) {
        return this.petRepository.save(pet);
    }

    /**
     * Delete that <code>Pet</code> entity.
     * @param pet
     */
    @Override
    public void delete(Pet pet) {
        this.petRepository.delete(pet);
    }

    /**
     * Delete an <code>Pet</code> entity with that ID.
     * @param aLong
     */
    @Override
    public void deleteById(Long aLong) {
        this.petRepository.deleteById(aLong);
    }
}
