package himani.spring.pet.springpetclinic.repositories;

import himani.spring.pet.springpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
