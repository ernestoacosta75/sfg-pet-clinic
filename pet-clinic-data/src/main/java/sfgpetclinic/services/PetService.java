package sfgpetclinic.services;

import sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * This interface represents the Pet entities management
 * in the service layer.
 *
 * To be implemented.
 *
 * @author  Ernesto A. Rodriguez Acosta
 */
public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
