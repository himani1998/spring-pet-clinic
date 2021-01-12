package himani.spring.pet.springpetclinic.services;

import himani.spring.pet.springpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName (String lastName);
}
