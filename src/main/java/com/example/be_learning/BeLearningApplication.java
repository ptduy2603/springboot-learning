package com.example.be_learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeLearningApplication {

	public static void main(String[] args) {
		System.out.println("Spring server is running!");
		SpringApplication.run(BeLearningApplication.class, args);
	}

}
