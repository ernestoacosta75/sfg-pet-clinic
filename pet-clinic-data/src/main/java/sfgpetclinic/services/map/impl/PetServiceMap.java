package sfgpetclinic.services.map.impl;

import sfgpetclinic.model.Pet;
import sfgpetclinic.services.PetService;
import sfgpetclinic.services.map.AbstractMapService;

import java.util.Set;

/**
 * This class represents the map service implementation
 * to manage the Pet entities.
 *
 * @author  Ernesto A. Rodriguez Acosta
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }


    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }
}
