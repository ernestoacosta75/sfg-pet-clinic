package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

/**
 * This class represents a base generic map service.
 *
 * To be extended
 *
 * @param <T> The entity
 * @param <ID> The entity's id
 *
 * @author  Ernesto A. Rodriguez Acosta
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    /**
     * Fetching all entity objects from the map.
     * @return Set<T>
     */
    protected Set<T> findAll() {
        return new HashSet<>(map.values());
    };

    /**
     * Fetch the entity object with that id from the map.
     * @param id
     * @return <T> entity
     */
    protected T findById(ID id) {
        return map.get(id);
    }

    /**
     * Save the entity object into the map.
     * @param object
     * @return <T> entity
     */
    protected T save(T object) {

        if(object != null) {
            if(object.getId() == null) {
                object.setId(getNextId());
            }

            map.put(object.getId(), object);
        }
        else {
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    /**
     * Remove the entity object with that id from the map.
     * @param id
     */
    protected void deleteById(ID id) {
        map.remove(id);
    }

    /**
     * Remove that entity object from the map.
     * @param object
     */
    protected void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId() {

        Long nextId = null;

        try {
            nextId = Collections.max(map.keySet()) + 1;
        }
        catch(NullPointerException npe) {
            nextId = 1L;
        }
        catch(NoSuchElementException nse) {
            nextId = 1L;
        }

        return nextId;
    }
}
