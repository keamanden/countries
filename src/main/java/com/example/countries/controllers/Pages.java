package com.example.countries.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class Pages {

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }




}


