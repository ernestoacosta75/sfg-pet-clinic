package sfgpetclinic.services;

import sfgpetclinic.model.Owner;

/**
 * This interface represents the Owner entities management
 * in the service layer.
 *
 * To be implemented.
 *
 * @author  Ernesto A. Rodriguez Acosta
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
