package himani.spring.pet.springpetclinic.repositories;

import himani.spring.pet.springpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}
