package com.example.practice1.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @Controller
    public class HomeController {
        @GetMapping("/")
        public String home(Model model)
        { return "home/index";
        }
    }

}
