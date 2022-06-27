package org.petgo.jing_yuan.controller;

import org.petgo.jing_yuan.model.Pet;
import org.petgo.jing_yuan.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("/pets")
    public List<Pet> getAllTutorials(@RequestParam(required = false) String title) {
        return petService.getAllPets();

    }

    @GetMapping("/pets/{id}")
    public Optional<Pet> getTutorialById(@PathVariable("id") long id) {
        /*
         * the TutorialRepository provides a method findById(). This methods takes the
         * id of the
         * Pet to find. This method used to be findOne(). But since Spring data jpa
         * 2.0 it's changed to findById().
         */
        return petService.getPetById(id);
    }

    /*
     * To add new Tutorials is really easy. You do this by using the
     * TutorialRepository save() method.
     */
    @PostMapping("/pets")
    public void createTutorial(@RequestBody Pet Pet) {
        petService.addPet(Pet);
    }

    // To update a Pet record, we used the same save() and findById()
    @PutMapping("/pets/{id}")
    public void updateTutorial(@PathVariable("id") long id, @RequestBody Pet pet) {
        Optional<Pet> petData = petService.getPetById(id);

        if (petData.isPresent()) {
            Pet _pet = petData.get();
            _pet.setId(pet.getId());
            _pet.setName(pet.getName());
            _pet.setDescription(pet.getDescription());
            _pet.setImageUrl(pet.getImageUrl());

            petService.addPet(_pet);
        }
    }

    @DeleteMapping("/pets/{id}")
    public void deleteTPet(@PathVariable("id") long id) {
        petService.deletePet(id);
    }

}
