package sfgpetclinic.model;

import java.util.StringJoiner;

/**
 * This POJO represents the Veterinary entity.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
public class Vet extends Person {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return new StringJoiner("|", Vet.class.getSimpleName() + "[", "]")
                .add("id=" + this.getId())
                .add("firstName=" + this.getFirstName())
                .add("lastName=" + this.getLastName())
                .toString();
    }
}

