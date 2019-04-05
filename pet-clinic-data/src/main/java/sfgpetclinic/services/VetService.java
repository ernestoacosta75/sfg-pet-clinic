package sfgpetclinic.services;

import sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * This interface represents the Vet entities management
 * in the service layer.
 *
 * To be implemented.
 *
 * @author  Ernesto A. Rodriguez Acosta
 */
public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
