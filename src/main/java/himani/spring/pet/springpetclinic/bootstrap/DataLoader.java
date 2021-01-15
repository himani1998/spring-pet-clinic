package himani.spring.pet.springpetclinic.bootstrap;

import himani.spring.pet.springpetclinic.model.Owner;
import himani.spring.pet.springpetclinic.model.Vet;
import himani.spring.pet.springpetclinic.services.OwnerService;
import himani.spring.pet.springpetclinic.services.VetService;
import himani.spring.pet.springpetclinic.services.map.OwnerServiceMap;
import himani.spring.pet.springpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1= new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setFirstName("Cisco");
        owner2.setLastName("White");

        ownerService.save(owner2);
        System.out.println("Loaded Owners....");

        Vet vet1= new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);


        Vet vet2= new Vet();
        vet2.setFirstName("Lex");
        vet2.setLastName("Brown");

        vetService.save(vet2);
        System.out.println("Loaded Vets....");



    }
}
