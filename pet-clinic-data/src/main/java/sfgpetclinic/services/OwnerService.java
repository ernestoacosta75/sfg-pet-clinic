package sfgpetclinic.services;

import sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * This interface represents the Owner entities management
 * in the service layer.
 *
 * To be implemented.
 *
 * @author  Ernesto A. Rodriguez Acosta
 */
public interface OwnerService {

    Owner findById(Long id);
    Owner findByLastName(String lastName);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
