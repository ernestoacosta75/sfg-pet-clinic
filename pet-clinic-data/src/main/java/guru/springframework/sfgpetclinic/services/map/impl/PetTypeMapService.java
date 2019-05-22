package guru.springframework.sfgpetclinic.services.map.impl;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.map.AbstractMapService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * This class represents the map service implementation
 * to manage the PetType entities.
 *
 * @author  Ernesto A. Rodriguez Acosta
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType petType) {
        return super.save(petType);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
