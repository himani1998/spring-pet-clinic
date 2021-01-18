package himani.spring.pet.springpetclinic.repositories;

import himani.spring.pet.springpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
