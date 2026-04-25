package com.example.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaApplication {

	public static void main(String[] args) {
                System.out.println("Java application start");
		SpringApplication.run(JavaApplication.class, args);
	}

}
