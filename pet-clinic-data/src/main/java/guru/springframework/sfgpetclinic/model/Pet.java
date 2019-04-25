package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;
import java.util.StringJoiner;

/**
 * This POJO represents the Pet entity.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
public class Pet extends BaseEntity {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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
        return new StringJoiner("|", Pet.class.getSimpleName() + "[", "]")
                .add("id=" + this.getId())
                .add("petType=" + this.getPetType())
                .add("owner=" + this.getOwner())
                .toString();
    }
}
