package org.petgo.jing_yuan.service;

import org.petgo.jing_yuan.model.User;
import org.petgo.jing_yuan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUserById(long id) {
        return userRepository.findById(id);

    }

    public List<User> getAllUsers() {
        return userRepository.findAll();

    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(long id, User user) {
        Optional<User> UserData = userRepository.findById(id);

        if (UserData.isPresent()) {
            User _user = UserData.get();
            _user.setEmail(user.getEmail());
            _user.setPassword(user.getPassword());
            userRepository.save(_user);
        }
    }

    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

}
