package org.petgo.jing_yuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j // use Slf4j to use log
public class LoginController {

    // get mapping to render the page
    // use GetMapping connect to all html pages
    // use log to print infomation. warnning,error etc
    @GetMapping("/login")
    public String loginForm() {
        log.info("login");
        return "login";
    }

    @PostMapping("/login-submit")

    public String LoginSubmit(@RequestParam String email, @RequestParam String password) {
        log.info("Post-login, lead to application page");
        return "account";
    }
}
