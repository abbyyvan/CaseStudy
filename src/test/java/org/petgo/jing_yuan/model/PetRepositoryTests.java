package org.petgo.jing_yuan.model;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.petgo.jing_yuan.repository.PetRepository;
import org.petgo.jing_yuan.repository.UserRepository;
import org.petgo.jing_yuan.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class PetRepositoryTests {
    @Autowired
    PetRepository repo;

    @Test
    @Order(1)
    @Rollback(value = false)
    public void savePetTest() {

        Pet pet = new Pet();
        pet.setName("lily");
        pet.setAge("2");

        repo.save(pet);

        Assertions.assertThat(pet.getId()).isGreaterThan(0);
    }

    @Test
    @Order(2)
    public void getAllPetsTest() {

        List<Pet> pets = repo.findAll();

        Assertions.assertThat(pets.size()).isGreaterThan(0);

    }

   

 

}
