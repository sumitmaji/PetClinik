package com.sum.petclinik.bootstrap;

import com.sum.petclinik.model.Owner;
import com.sum.petclinik.model.Vet;
import com.sum.petclinik.services.OwnerService;
import com.sum.petclinik.services.VetService;
import com.sum.petclinik.services.map.OwnerServiceMap;
import com.sum.petclinik.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1l);
        owner1.setFirtName("Sumit");
        owner1.setLastName("Maji");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2l);
        owner2.setFirtName("Susmita");
        owner2.setLastName("Mondal");

        ownerService.save(owner2);

        System.out.println("Loaded owners");

        Vet vet1 = new Vet();
        vet1.setId(1l);
        vet1.setFirtName("Pramit");
        vet1.setLastName("Maji");

        vetService.save(vet1);

        System.out.println("Loaded vets");
    }
}
