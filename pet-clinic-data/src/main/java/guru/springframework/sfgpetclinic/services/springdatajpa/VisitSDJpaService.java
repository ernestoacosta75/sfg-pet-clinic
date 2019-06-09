package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.repositories.VisitRepository;
import guru.springframework.sfgpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Service class for <code>Visit</code> domain visits.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    /**
     * Returns a set of all <code>Visit</code> entities.
     * @return Visit's set entities.
     */
    @Override
    public Set<Visit> findAll() {
        Set<Visit> visitSet = new HashSet<Visit>();
        this.visitRepository.findAll().forEach(visitSet::add);

        return visitSet;
    }

    /**
     * Return the <code>Visit</code> entity with that ID. Otherwise, returns null.
     * @param aLong
     * @return Visit entity or null.
     */
    @Override
    public Visit findById(Long aLong) {
        return this.visitRepository.findById(aLong).orElse(null);
    }

    /**
     * Returns the <code>Visit</code> entity saved.
     * @param visit
     * @return Visit entity saved
     */
    @Override
    public Visit save(Visit visit) {
        return this.visitRepository.save(visit);
    }

    /**
     * Delete that <code>Visit</code> entity.
     * @param visit
     */
    @Override
    public void delete(Visit visit) {
        this.visitRepository.delete(visit);
    }

    /**
     * Delete an <code>Visit</code> entity with that ID.
     * @param aLong
     */
    @Override
    public void deleteById(Long aLong) {
        this.visitRepository.deleteById(aLong);
    }
}
