package himani.spring.pet.springpetclinic.services.map;

import himani.spring.pet.springpetclinic.model.Speciality;
import himani.spring.pet.springpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class SpecialityMapService extends AbstractMapService<Speciality,Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void Delete(Speciality object) {
        super.Delete(object);
    }

    @Override
    public void DeleteById(Long id) {
         super.DeleteById(id);
    }
}
