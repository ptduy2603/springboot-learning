package com.app.controllers;

import com.app.services.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    private final HelloService helloService;

    // handle dependencies injection
    public AppController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        // controller handle pick out suitable services
        return helloService.sayHello();
    }
}
