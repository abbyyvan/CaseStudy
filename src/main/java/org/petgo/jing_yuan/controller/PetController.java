package org.petgo.jing_yuan.controller;

import org.petgo.jing_yuan.model.Pet;
import org.petgo.jing_yuan.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@Slf4j
// @RequestMapping("/admin")
public class PetController {

    @Autowired
    private PetService petService;

    // @GetMapping("/view-pet")
    // public String viewPetPage(Model model) {
    // model.addAttribute("listPets", petService.getAllPets());
    // return "pet";
    // }

    @GetMapping("/pet")
    public String viewPetPage(Model model) {
        model.addAttribute("listPets", petService.getAllPets());
        return "pet";
    }
    
    @GetMapping("/petCard")
    public String viewPetCard(Model model) {
        model.addAttribute("listPets", petService.getAllPets());
        return "pet_card";
    }

    // add new pet
    @GetMapping("/showNewPet")
    public String showNewPet(Model model) {
        Pet pet = new Pet();
        model.addAttribute("pet", pet);
        return "new_pet";
    }

    @PostMapping("/savePet")
    public String addPet(@ModelAttribute("pet") Pet pet) {
        // save pet to repository
        petService.addPet(pet);
        return "redirect:/pet";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        Pet pet = petService.getPetById(id);
        log.info("update pet");
        model.addAttribute("pet", pet);
        return "update_pet_form";
    }

    @DeleteMapping("/deletePet/{id}")
    public String delPet(@PathVariable(value = "id") long id) {
        this.petService.deletePet(id);
        return "redirect:/update_pet_form";
    }

}
