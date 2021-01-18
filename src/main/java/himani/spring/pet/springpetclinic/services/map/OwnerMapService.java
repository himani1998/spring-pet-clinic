package himani.spring.pet.springpetclinic.services.map;

import himani.spring.pet.springpetclinic.model.Owner;
import himani.spring.pet.springpetclinic.model.Pet;
import himani.spring.pet.springpetclinic.services.CrudService;
import himani.spring.pet.springpetclinic.services.OwnerService;
import himani.spring.pet.springpetclinic.services.PetService;
import himani.spring.pet.springpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner,Long> implements OwnerService {
    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findByLastName(String lastName) {
        Set<Owner> owners = new HashSet<>();
        this.findAll().forEach(owner -> {
            if(owner.getLastName().equalsIgnoreCase(lastName))owners.add(owner);
        });
        if(owners.size()>0)
            return owners;
        return null;
    }


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        if(object!=null){
            if(object.getPets()!=null){
                object.getPets().forEach(pet->{
                    if(pet.getPetType()!=null){
                        if(pet.getPetType().getId()==null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    }else{
                        throw new RuntimeException("Pet Type is Required");
                    }
                    if(pet.getId()== null){
                        Pet savedPet= petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        }else {
            return null;
        }
    }


    @Override
    public void Delete(Owner object) {
      super.Delete(object);
    }

    @Override
    public void DeleteById(Long id) {
        super.DeleteById(id);
    }
}
