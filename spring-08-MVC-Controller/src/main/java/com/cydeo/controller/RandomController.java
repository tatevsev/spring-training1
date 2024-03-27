package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RandomController {

    @RequestMapping("/login")
    public String loginPage(){
        return "login.html";
    }
}
