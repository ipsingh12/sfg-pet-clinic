package inder.springframework.sfgpetclinic.services;

import inder.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet save(Vet Vet);
    Vet findById(Long id);
    Set<Vet> findAll();

}
