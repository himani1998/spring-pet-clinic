package himani.spring.pet.springpetclinic.services.map;

import himani.spring.pet.springpetclinic.model.Owner;
import himani.spring.pet.springpetclinic.services.CrudService;
import himani.spring.pet.springpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {
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
        return super.save(object.getId(), object);
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
