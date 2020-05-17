package guru.springframework.petcliniclast.services;

import guru.springframework.petcliniclast.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
