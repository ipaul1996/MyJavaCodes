package com.ip.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ip.model.Student;


@RestController
public class MyController {

	@RequestMapping("/welcome")
	public String myWelcomeHandler() {
		return "Welcome to Spring Boot";
	}
	
	@RequestMapping("/hello")
	public String myHelloHandler() {
		return "Hello World";
	}
	
	@RequestMapping("/student")
	public Student getStudent() {
		return new Student(1, "Abhijit", "Kolkata", 98);
	}
}
