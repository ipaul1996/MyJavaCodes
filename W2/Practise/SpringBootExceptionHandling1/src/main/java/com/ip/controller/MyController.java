package com.ip.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ip.exceptions.InvalidIdException;

@RestController
public class MyController {

	@GetMapping("/students/{id}")
	public String myMethodHandler(@PathVariable("id") Integer id) throws InvalidIdException {
		
		if(id > 10) {
			throw new InvalidIdException("Invalid Id");
		} 
		
		return "Correct Id Range";
	}
	
}
