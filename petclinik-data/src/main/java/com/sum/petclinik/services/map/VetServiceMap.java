package com.sum.petclinik.services.map;

import com.sum.petclinik.model.Vet;
import com.sum.petclinik.services.CrudService;
import com.sum.petclinik.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet t) {
        super.delete(t);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet
        );
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
