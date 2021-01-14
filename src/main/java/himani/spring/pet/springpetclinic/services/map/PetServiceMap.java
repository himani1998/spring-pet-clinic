package himani.spring.pet.springpetclinic.services.map;


import himani.spring.pet.springpetclinic.model.Pet;
import himani.spring.pet.springpetclinic.services.CrudService;
import himani.spring.pet.springpetclinic.services.PetService;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void Delete(Pet object) {
        super.Delete(object);
    }

    @Override
    public void DeleteById(Long id) {
        super.DeleteById(id);
    }
}
