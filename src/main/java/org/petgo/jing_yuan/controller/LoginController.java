package org.petgo.jing_yuan.controller;

import org.petgo.jing_yuan.model.User;
import org.petgo.jing_yuan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j // use Slf4j to use log
public class LoginController {
    @Autowired
    UserRepository userRep;

    // use log to print infomation. warnning,error etc
    @GetMapping("/login")
    public String loginFormSubmit(Model model) {
        log.info("login-GET");
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login-submit")

    public String LoginSubmit(User user) {
        log.info("Post-login");
        String email = user.getEmail();
        if (userRep.findByEmail(user.getEmail()) != null) {
            return "redirect:/pet";
        } else
            return "redirect:/login";

    }

    @GetMapping("/forget-password")
    public String forgetPassword() {
        return "forget-password";
    }

    @GetMapping("/account")
    public String acc() {
        return "account";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }

}
