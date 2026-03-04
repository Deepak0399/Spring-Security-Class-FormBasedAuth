package com.practice.demo2formbased.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MyController {
    @GetMapping("/index")
    public String welcomeHome() {
        return "index";
    }
    @GetMapping("/admin")
    public String adminHome() {
        return "admin";
    }
    @GetMapping("/member")
    public String memberPage() {
        return "member";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    @GetMapping("/logout")
    public String logoutPage() {
        return "logout";
    }
}
