package guru.springframework.sfgpetclinic.services.map.impl;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.AbstractMapService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * This class represents the map service implementation
 * to manage the Vet entities.
 *
 * @author  Ernesto A. Rodriguez Acosta
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private  final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {

        if(vet.getSpecialities().size() > 0) {
            vet.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null) {
                    //Saving the speciality entity
                    Speciality savedSpeciality = specialityService.save(speciality);

                    //Set the id to speciality entity (for safe)
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(vet);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
