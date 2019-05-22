package guru.springframework.sfgpetclinic.model;

import java.util.Set;
import java.util.StringJoiner;

/**
 * Simple Java Bean domain object representing an owner.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;

    private Set<Pet> pets;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
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
        return new StringJoiner("|", Owner.class.getSimpleName() + "[", "]")
                .add("id=" + this.getId())
                .add("firstName=" + this.getFirstName())
                .add("lastName=" + this.getLastName())
                .toString();
    }
}
