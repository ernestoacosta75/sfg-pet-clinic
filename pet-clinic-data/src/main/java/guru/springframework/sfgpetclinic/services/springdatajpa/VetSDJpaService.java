package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.repositories.VetRepository;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Service class for <code>Vet</code> domain objects.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    /**
     * Returns a set of all <code>Vet</code> entities.
     * @return Vet's set entities.
     */
    @Override
    public Set<Vet> findAll() {
        Set<Vet> vetSet = new HashSet<Vet>();
        this.vetRepository.findAll().forEach(vetSet::add);

        return vetSet;
    }

    /**
     * Return the <code>Vet</code> entity with that ID. Otherwise, returns null.
     * @param aLong
     * @return Vet entity or null.
     */
    @Override
    public Vet findById(Long aLong) {
        return this.vetRepository.findById(aLong).orElse(null);
    }

    /**
     * Returns the <code>Vet</code> entity saved.
     * @param vet
     * @return Vet entity saved
     */
    @Override
    public Vet save(Vet vet) {
        return this.vetRepository.save(vet);
    }

    /**
     * Delete that <code>Vet</code> entity.
     * @param vet
     */
    @Override
    public void delete(Vet vet) {
        this.vetRepository.delete(vet);
    }

    /**
     * Delete an <code>Vet</code> entity with that ID.
     * @param aLong
     */
    @Override
    public void deleteById(Long aLong) {
        this.vetRepository.deleteById(aLong);
    }
}
