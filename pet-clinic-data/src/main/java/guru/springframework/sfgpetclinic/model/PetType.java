package guru.springframework.sfgpetclinic.model;

/**
 * Simple Java Bean domain object representing a pet type.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
