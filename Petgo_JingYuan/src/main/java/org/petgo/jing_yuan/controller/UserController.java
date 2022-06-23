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

    @GetMapping("/logintest")
    public String register() {
        // userService.addUser(user);
        System.out.println("postmappings");
        // return "redirect:/login";
        return "login";
    }

}
