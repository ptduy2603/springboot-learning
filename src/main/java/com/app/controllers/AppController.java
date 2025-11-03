package com.app.controllers;

import com.app.Content;
import com.app.services.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {
    private final HelloService helloService;

    public AppController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping()
    public String index() {
        return "Welcome to Duy server";
    }

    @GetMapping("/hello")
    public Content sayHello() {
        return this.helloService.sayHello();
    }
}
