package org.petgo.jing_yuan.repository;

import org.petgo.jing_yuan.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long>
// Tutorial → Entity type and Long --> primary key
{
    // findByPublished is a custom method()
    List<Tutorial> findByPublished(boolean published);
}
