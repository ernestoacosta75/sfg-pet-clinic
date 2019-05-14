package guru.springframework.sfgpetclinic.model;

/**
 * This POJO represents the Person entity.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
