package com.sum.petclinik.services.map;

import com.sum.petclinik.model.Pet;
import com.sum.petclinik.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet t) {
        super.delete(t);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet
        );
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
