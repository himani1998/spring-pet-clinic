package himani.spring.pet.springpetclinic.controllers;

import himani.spring.pet.springpetclinic.model.Owner;
import himani.spring.pet.springpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/Owner"})
    public Set<Owner> ownerList(){
        return ownerService.findAll();
    }
}
