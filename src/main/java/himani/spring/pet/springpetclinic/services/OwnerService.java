package himani.spring.pet.springpetclinic.services;

import himani.spring.pet.springpetclinic.model.Owner;

import java.util.Set;


public interface OwnerService extends CrudService<Owner,Long>{
    Set<Owner> findByLastName (String lastName);
}
