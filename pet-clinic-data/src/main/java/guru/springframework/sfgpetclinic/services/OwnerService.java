package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * This interface represents the Owner entities management
 * in the service layer.
 *
 * To be implemented.
 *
 * @author  Ernesto A. Rodriguez Acosta
 */
public interface OwnerService extends CrudService<Owner, Long> {

    /**
     * Returns the Owner entity with that last name.
     * @param lastName
     * @return Owner entity.
     */
    Owner findByLastName(String lastName);
}
