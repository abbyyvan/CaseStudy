package org.petgo.jing_yuan.model;

import org.junit.jupiter.api.Test;
import org.petgo.jing_yuan.repository.UserRepository;
import org.petgo.jing_yuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class ServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testGetAll() {
        List<User> u = userService.getAllUsers();
        assertThat(u).isNotNull();
    }

  

}
