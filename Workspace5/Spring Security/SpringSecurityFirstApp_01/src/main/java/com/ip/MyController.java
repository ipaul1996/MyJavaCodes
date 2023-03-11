package com.ip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hey")
public class MyController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Welcome to Spring Security"; 
	}

}
