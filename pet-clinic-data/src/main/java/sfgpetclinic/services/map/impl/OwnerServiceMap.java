package sfgpetclinic.services.map.impl;

import sfgpetclinic.model.Owner;
import sfgpetclinic.services.OwnerService;
import sfgpetclinic.services.map.AbstractMapService;

import java.util.Set;

/**
 * This class represents the map service implementation
 * to manage the Owner entities.
 *
 * @author  Ernesto A. Rodriguez Acosta
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }



}
