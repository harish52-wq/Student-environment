package com.example.simpleWeb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/about")
    public String about(){
        return "This is the about page";
    }
}
