package himani.spring.pet.springpetclinic.services.map;

import himani.spring.pet.springpetclinic.model.PetType;
import himani.spring.pet.springpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType,Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void Delete(PetType object) {
        super.Delete(object);
    }

    @Override
    public void DeleteById(Long id) {
        super.DeleteById(id);
    }
}
