package himani.spring.pet.springpetclinic.bootstrap;

import himani.spring.pet.springpetclinic.model.*;
import himani.spring.pet.springpetclinic.services.OwnerService;
import himani.spring.pet.springpetclinic.services.PetTypeService;
import himani.spring.pet.springpetclinic.services.SpecialityService;
import himani.spring.pet.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog= new PetType();
        dog.setName("dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat= new PetType();
        cat.setName("cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Speciality radiology= new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology= specialityService.save(radiology);

        Speciality surgery= new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery= specialityService.save(surgery);

        Speciality dentistry= new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry= specialityService.save(dentistry);

        Owner owner1= new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress(" 1234 Wiliston Plaza");
        owner1.setCity("Miami");
        owner1.setTelephone("0987654321");

        Pet myPet= new Pet();
        myPet.setPetType(saveDogPetType);
        myPet.setOwner(owner1);
        myPet.setBirthDate(LocalDate.now());
        myPet.setName("Rocky");
        owner1.getPets().add(myPet);
        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setFirstName("Cisco");
        owner2.setLastName("White");
        owner2.setAddress(" 765 Butler Plaza");
        owner2.setCity("Gainesville");
        owner2.setTelephone("0982762635421");
        Pet ciscoPet= new Pet();
        ciscoPet.setPetType(saveCatPetType);
        ciscoPet.setOwner(owner2);
        ciscoPet.setBirthDate(LocalDate.now());
        ciscoPet.setName("kitti");
        owner2.getPets().add(ciscoPet);
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
