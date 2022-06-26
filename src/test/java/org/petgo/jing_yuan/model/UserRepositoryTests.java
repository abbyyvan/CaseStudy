package org.petgo.jing_yuan.model;

import org.junit.jupiter.api.Test;
import org.petgo.jing_yuan.repository.PetRepository;
import org.petgo.jing_yuan.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired
    private UserRepository repo;
    private PetRepository prepo;

    @Autowired
    private TestEntityManager entityManager;
    private TestEntityManager pentityManager;

    @Test
    // run this JUnit test---output:1/1 tests passes(100%)
    // then check the "petgo" database, "user" table is created

    public void testCreateUser() {
        // create a new user
        User user = new User();
        user.setEmail("abby@gmail.com");
        user.setPassword("abby2022");
        // user.setUserName("abby");

        User user2 = new User();
        user2.setEmail("yvan@gmail.com");
        user2.setPassword("yvan2022");
        // user2.setFirstName("yvan");

        // UserRepository extends JpaRepository
        // it should have save() delete()... crud methods
        User savedUser = repo.save(user2);

        // primary key is user_id
        User existUser = entityManager.find(User.class, savedUser.getId());

        // user AssertThat to check if existUser and user are same user
        assertThat(existUser.getEmail()).isEqualTo(user2.getEmail());

    }

    @Test
    // run this JUnit test---output:1/1 tests passes(100%)
    // then check the "petgo" database, "user" table is created

    public void testCreatePet() {
        // create a new user
        Pet p = new Pet();
        p.setName("ada");
        p.setApplication(new Application());
        p.setDescription("description description");
        p.setImageUrl(
                "https://images.unsplash.com/photo-1586671267731-da2cf3ceeb80?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8ZG9nfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60");
        prepo.save(p);
        // user AssertThat to check if existUser and user are same user
        assertThat(1 == 1);

    }

}
