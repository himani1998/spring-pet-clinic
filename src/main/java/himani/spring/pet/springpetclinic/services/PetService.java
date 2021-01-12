package himani.spring.pet.springpetclinic.services;

import himani.spring.pet.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findByLastName (String lastName);
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
