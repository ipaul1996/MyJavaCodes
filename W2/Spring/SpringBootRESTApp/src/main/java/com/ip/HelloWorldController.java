package com.ip;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "studentapp")
public class HelloWorldController {
	
	@RequestMapping(value = "/Welcome", method = RequestMethod.GET)
	public ResponseEntity<String> sayHello() {
		HttpHeaders hh = new HttpHeaders();
		hh.add("jwt", "abc1213");
		
		return new ResponseEntity<>("Welcome to Spring", hh, HttpStatus.OK) ;
	}
	
	@GetMapping(value = "/student/{roll}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Student getStudent(@PathVariable("roll") Integer roll,
							  @RequestParam(required = false) String name, 
							  @RequestParam(required = false) Integer marks) {
		
		if(roll > 100) {
			throw new IllegalArgumentException("Invalid roll");
		}
		Student student = new Student();
		student.setRoll(roll);
		student.setName(name);
		student.setMarks(marks);
		
		return student;
		
	}
	
	
	
	@PostMapping(value = "/saveStudent", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveStudentDetails(@RequestBody Student student) {
		return student.toString() + " saved successfuly...";
	}
	
	
	@PutMapping(value = "/updateStudent")
	public String updateStudentHandler(@RequestBody Student student,
										@RequestParam Integer gmarks) {
		
		 student.setMarks(student.getMarks()+gmarks);
		 
		 return student.toString()+" updated";
		
	}
	
	
	
	@GetMapping(value = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getAllStudent() {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10, "Rohit", 85));
		students.add(new Student(11, "Nrupul", 75));
		students.add(new Student(12, "Kijal", 62));
		students.add(new Student(13, "Biltu", 48));
		students.add(new Student(14, "Ajay", 89));
		
		return students;
		
	}
	
	
	
	
	
	

}
