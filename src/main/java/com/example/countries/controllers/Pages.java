package com.example.countries.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class Pages {

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }




}


