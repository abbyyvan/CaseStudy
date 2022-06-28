package org.petgo.jing_yuan.controller;

import java.util.UUID;

import org.petgo.jing_yuan.model.User;
import org.petgo.jing_yuan.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class UserController {

    private static final String LOGIN = "redirect:/login";

    @Autowired
    private UserService userService;

    @GetMapping("register")
    public String registerSubmit(Model model) {
        model.addAttribute("user", new User());

        return "register";
    }

    @PostMapping("register")
    public String registerSubmit(User user) {
        log.info("Post register, go to sign in page");

        userService.addUser(user);
        return LOGIN;
    }

   

    @DeleteMapping(path = "{id}")
    public void deleteUserById(@PathVariable("id") long id) {
        userService.deleteUser(id);
    }

    // @GetMapping("/register")
    // String signUpPage(Model model) {
    // model.addAttribute("user_request_body", new User());
    // System.out.println("getmapping");
    // log.info("GET-/register");
    // return "register";
    // // go to register.html page
    // }

    // @GetMapping("/login")
    // public String login() {
    // return "login";
    // }

    // @GetMapping("/account")
    // public String acc() {
    // return "account";
    // }

    // @GetMapping("/pet")
    // public String petCard() {
    // return "pet";
    // }

}
