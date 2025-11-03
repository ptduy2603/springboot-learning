package com.app.services;

import com.app.Content;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public Content sayHello() {
        return new Content("Hello! Welcome to my server","Duy Pham dev");
    }
}
