package com.sum.petclinik.services;

import com.sum.petclinik.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
