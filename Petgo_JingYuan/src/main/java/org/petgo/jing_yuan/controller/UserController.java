package org.petgo.jing_yuan.controller;

import org.petgo.jing_yuan.model.User;
import org.petgo.jing_yuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    String signUpPage(Model model) {
        model.addAttribute("user_request_body", new User());
        System.out.println("getmapping");
        return "register";
        // go to register.html page
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("register")
    public String registerSubmit(@RequestParam String email, @RequestParam String password) {
        System.out.println("registerSubmit: " + email + ", " + password);
        User newUser = new User();
        newUser.setEmail(email);
        newUser.setPassword(password);
        userService.addUser(newUser);
        return "redirect:/login";
    }

}
