package org.petgo.jing_yuan.controller;

import org.petgo.jing_yuan.dto.AdminDto;
import org.petgo.jing_yuan.model.Admin;
import org.petgo.jing_yuan.service.serverImplement.AdminServiceImpl;
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
    private AdminServiceImpl adminService;

    // get mapping to render the page
    // use GetMapping connect to all html pages
    // use log to print infomation. warnning,error etc
    @GetMapping("/login")
    public String loginForm() {
        log.info("login");
        return "login";
    }

    @GetMapping("/register")
    String signUpPage(Model model) {
        model.addAttribute("adminDto", new AdminDto());
        // System.out.println("getmapping");
        log.info("GET-/register");
        return "register";
        // go to register.html page
    }

    @PostMapping("/register-new")
    public String addNewAdmin(@ModelAttribute("adminDto") AdminDto adminDto, BindingResult result, Model model,
            RedirectAttributes redirectAttributes) {
        // check if password matches, or has other errors
        // if error occur request register page agin
        try {
            if (result.hasErrors()) {
                model.addAttribute("adminDto", adminDto);
                return "register";
            }

            String username = adminDto.getUsername();
            Admin admin = adminService.findByUsername(username);
            if (admin != null) {
                model.addAttribute("adminDto", adminDto);
                redirectAttributes.addFlashAttribute("message", "this username has been taken");
                return "register";
            }
            adminService.save(adminDto);
            model.addAttribute("adminDto", adminDto);
            redirectAttributes.addFlashAttribute("message", "Success!");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("message", "There was something wrong");
        }
        return "register";

    }

    @GetMapping("/forget-password")
    public String forgetPassword() {
        return "forget-password";
    }

    @GetMapping("/account")
    public String acc() {
        return "account";
    }

    @GetMapping("/pet")
    public String petCard() {
        return "pet";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }

    @PostMapping("/login-submit")

    public String LoginSubmit(@RequestParam String email, @RequestParam String password) {
        log.info("Post-login, lead to application page");
        return "pet";
    }
}
