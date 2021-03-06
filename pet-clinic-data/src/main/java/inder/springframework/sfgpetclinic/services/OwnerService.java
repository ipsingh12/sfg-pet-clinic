package inder.springframework.sfgpetclinic.services;

import inder.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
    Owner findByLastName(String lastName);
}
