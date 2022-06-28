package org.petgo.jing_yuan.controller;


import org.petgo.jing_yuan.model.User;
import org.petgo.jing_yuan.service.ApplicationService;
import org.petgo.jing_yuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class UserController {
     @Autowired
    private UserService userService;

    private static final String USER = "redirect:/user";

     @GetMapping("/user")
    public String viewUserPage(Model model) {
        model.addAttribute("listUsers", userService.getAllUsers());
        return "user";
    }

   

    // // add new user
    // @GetMapping("/showNewUser")
    // public String showNewUser(Model model) {
    //     User user = new User();
    //     model.addAttribute("user", user);
    //     return "new_user";
    // }

    // @PostMapping("/saveUser")
    // public String addUser(@ModelAttribute("user") User user) {
    //     // save user to repository
    //     userService.addUser(user);
    //     return USER;
    // }

    // @GetMapping("/showFormForUpdate/{id}")
    // public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
    //     User user = userService.getUserById(id);
    //     log.info("update user");
    //     model.addAttribute("user", user);
    //     return "update_user_form";
    // }

    // @DeleteMapping("/deleteUser/{id}")
    // public String delUser(@PathVariable(value = "id") long id) {
    //     userService.deleteUser(id);
    //     return USER;
    // }
    
}
