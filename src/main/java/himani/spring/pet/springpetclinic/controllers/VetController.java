package himani.spring.pet.springpetclinic.controllers;

import himani.spring.pet.springpetclinic.model.Vet;
import himani.spring.pet.springpetclinic.services.VetService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/Vet"})
    public Set<Vet> listVets(){
        return vetService.findAll();
    }
}
