package org.petgo.jing_yuan.repository;

import java.util.Optional;

import org.petgo.jing_yuan.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

    void deleteById(Optional<Pet> findById);

}
