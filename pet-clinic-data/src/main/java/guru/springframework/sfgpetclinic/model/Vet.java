package guru.springframework.sfgpetclinic.model;

import java.util.Set;
import java.util.StringJoiner;

/**
 * Simple Java Bean domain object representing a vet.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }

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

