package guru.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

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
     * @param id
     * @param object
     * @return <T> entity
     */
    protected T save(ID id, T object) {
        map.put(id, object);

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
}
