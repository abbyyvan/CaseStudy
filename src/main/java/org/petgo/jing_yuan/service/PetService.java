package org.petgo.jing_yuan.service;

import java.util.Optional;

import org.petgo.jing_yuan.model.Pet;
import org.petgo.jing_yuan.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {
    @Autowired
    private PetRepository petRepository;

    public Optional<Pet> getPetrById(long id) {
        return petRepository.findById(id);

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
            petRepository.save(_pet);
        }
    }

    public void deletePet(long id) {
        petRepository.deleteById(id);
    }
}
