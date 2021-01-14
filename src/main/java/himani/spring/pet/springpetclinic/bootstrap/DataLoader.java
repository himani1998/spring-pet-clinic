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

    public DataLoader() {
        ownerService= new OwnerServiceMap();
        vetService= new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1= new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Cisco");
        owner2.setLastName("White");

        ownerService.save(owner2);
        System.out.println("Loaded Owners....");

        Vet vet1= new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);


        Vet vet2= new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Lex");
        vet2.setLastName("Brown");

        vetService.save(vet2);
        System.out.println("Loaded Vets....");



    }
}
