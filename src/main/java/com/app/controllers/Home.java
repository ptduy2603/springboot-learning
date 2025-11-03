package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// dùng để trả về tài nguyên tĩnh view, html
@Controller
public class Home {
    @GetMapping("/home")
    public String loadHomePage() {
        return "home.html";
    }
}
