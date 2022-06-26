package org.petgo.jing_yuan.controller;

import org.petgo.jing_yuan.model.User;
import org.petgo.jing_yuan.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    // @GetMapping("/register")
    // String signUpPage(Model model) {
    //     model.addAttribute("user_request_body", new User());
    //     System.out.println("getmapping");
    //     log.info("GET-/register");
    //     return "register";
    //     // go to register.html page
    // }

    // @GetMapping("/login")
    // public String login() {
    // return "login";
    // }

    // @GetMapping("/account")
    // public String acc() {
    //     return "account";
    // }

    // @GetMapping("/pet")
    // public String petCard() {
    //     return "pet";
    // }

    @PostMapping("register")
    public String registerSubmit(@RequestParam String email, @RequestParam String password) {
        log.info("Post register, go to sign in page");
        User newUser = new User();
        newUser.setEmail(email);
        newUser.setPassword(password);
        userService.addUser(newUser);
        return "redirect:/login";
    }

    

}
