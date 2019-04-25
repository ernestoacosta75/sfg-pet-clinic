package guru.springframework.sfgpetclinic.services.map.impl;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.AbstractMapService;

import java.util.Set;

/**
 * This class represents the map service implementation
 * to manage the Vet entities.
 *
 * @author  Ernesto A. Rodriguez Acosta
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    protected Vet save(Long aLong, Vet object) {
        return super.save(aLong, object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
