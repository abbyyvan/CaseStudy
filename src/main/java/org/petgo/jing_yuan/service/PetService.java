package org.petgo.jing_yuan.service;

import java.util.List;
import java.util.Optional;

import org.petgo.jing_yuan.model.Pet;
import org.petgo.jing_yuan.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {
    @Autowired
    private PetRepository petRepository;

    public Pet getPetById(long id) {
        Optional<Pet> foundPet = petRepository.findById(id);
        Pet pet = null;
        if (foundPet.isPresent()) {
            pet = foundPet.get();
        } else {
            throw new RuntimeException("pet cannot be found by id::" + id);
        }
        return pet;

    }

    public List<Pet> getAllPets() {
        return petRepository.findAll();

    }

    public void addPet(Pet pet) {
        petRepository.save(pet);
    }

    public void updatePet(long id, Pet pet) {
        Optional<Pet> petData = petRepository.findById(id);

        if (petData.isPresent()) {
            Pet _pet = petData.get();
            _pet.setDescription(pet.getDescription());
            _pet.setImageUrl(pet.getImageUrl());
            _pet.setName(pet.getName());
            petRepository.save(_pet);
        }
    }

    public void deletePet(long id) {
        petRepository.deleteById(id);
    }
}
