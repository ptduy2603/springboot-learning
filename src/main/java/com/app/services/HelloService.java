package com.app.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello() {
        return "Hello world from Spring Boot BE";
    }
}
