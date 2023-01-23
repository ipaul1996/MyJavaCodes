package com.ip.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ip.model.Student;

@RestController
@RequestMapping("/studentApp")
public class MyController {
	
	@RequestMapping(value = "/students", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getAllStudentHandler() {
		
		List<Student> students = Arrays.asList(
				
				new Student(1, "Abhay", "Delhi", 85),
				new Student(2, "Rahul", "Pune", 79),
				new Student(3, "Punit", "Lature", 76),
				new Student(4, "Chandan", "Patna", 72),
				new Student(5, "Ajnatinu", "Mewar", 84)
		);
		
		return students;
				
	}
	
//	@RequestMapping(value = "/student", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	@RequestMapping("/students")
	@GetMapping("/student/{roll}")
	public Student getStudentHandler(@PathVariable("roll") Integer roll) {
		return new Student(roll, "Laxmi", "Delhi", 85);
	}
	
	@GetMapping("/student/{r}/{n}/{m}")
	public Student getStudentHandler2(@PathVariable("r") Integer roll, 
																   @PathVariable("n") String name, 
																   @PathVariable("m") Integer marks) {
		
		return new Student(roll, name, "Ajay", marks);
		
	}
	
	@GetMapping("/mystudent/{address}")
	public Student getStudentHandler3(@RequestParam("roll") Integer roll, 
																	@RequestParam("name") String name, 
																	@RequestParam(value = "marks", required = false) Integer marks,
																	@PathVariable("address") String address ) {
		return new Student(roll, name, address, marks);
	}
	
	@PostMapping("/savestudent")
	public String saveStudent(@RequestBody Student student) {
		
		return student.toString() + " student saved successfully..!";
	}

}
