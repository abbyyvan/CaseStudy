package org.petgo.jing_yuan.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.petgo.jing_yuan.model.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long>{
    
}
