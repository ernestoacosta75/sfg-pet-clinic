package guru.springframework.sfgpetclinic.model;

/**
 * Simple Java Bean domain object representing an speciality.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
