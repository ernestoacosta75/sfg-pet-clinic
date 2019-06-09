package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.repositories.OwnerRepository;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Service class for <code>Owner</code> domain objects.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetTypeRepository petTypeRepository;
    private final PetRepository petRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetTypeRepository petTypeRepository,
                             PetRepository petRepository ) {
        this.ownerRepository = ownerRepository;
        this.petTypeRepository = petTypeRepository;
        this.petRepository = petRepository;
    }

    /**
     * Returns an <code>Owner</code> entity with that last name.
     * @param lastName
     * @return Owner entity.
     */
    @Override
    public Owner findByLastName(String lastName) {
        return this.ownerRepository.findByLastName(lastName);
    }

    /**
     * Returns a Set of all <code>Owner</code> entities.
     * @return Set of all Owners entities.
     */
    @Override
    public Set<Owner> findAll() {
        Set<Owner> ownerSet = new HashSet<Owner>();
        this.ownerRepository.findAll().forEach(ownerSet::add);

        return ownerSet;
    }

    /**
     * Returns an <code>Owner</code> entity with that ID.
     * @param aLong
     * @return An Owner entity.
     */
    @Override
    public Owner findById(Long aLong) {
        return this.ownerRepository.findById(aLong).orElse(null);
    }

    /**
     * Save that <code>Owner</code> entity.
     * @param owner
     * @return Owner entity saved.
     */
    @Override
    public Owner save(Owner owner) {
        return this.ownerRepository.save(owner);
    }

    /**
     * Delete that <code>Owner</code> entity.
     * @param owner
     */
    @Override
    public void delete(Owner owner) {
        this.ownerRepository.delete(owner);
    }

    /**
     * Delete an <code>Owner</code> entity with that ID.
     * @param aLong
     */
    @Override
    public void deleteById(Long aLong) {
        this.ownerRepository.deleteById(aLong);
    }
}
