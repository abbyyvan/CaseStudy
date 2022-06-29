package org.petgo.jing_yuan.controller;

import org.petgo.jing_yuan.model.Pet;
import org.petgo.jing_yuan.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@Slf4j
// @RequestMapping("/admin")
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "css_test";
    }

    
}
