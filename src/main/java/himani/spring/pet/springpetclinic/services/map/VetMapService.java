package himani.spring.pet.springpetclinic.services.map;

import himani.spring.pet.springpetclinic.model.Vet;
import himani.spring.pet.springpetclinic.services.CrudService;
import himani.spring.pet.springpetclinic.services.VetService;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet,Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void Delete(Vet object) {
        super.Delete(object);
    }

    @Override
    public void DeleteById(Long id) {
        super.DeleteById(id);
    }
}
