package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * This class represents the base entity to be extended
 * for the entities of our data layer.
 *
 * To be extended.
 *
 * @author Ernesto A. Rodriguez Acosta
 */
public class BaseEntity implements Serializable {

    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
