package com.ip.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ip.model.Student;

@RestController
public class StudentController {
	
	List<Student> students = new ArrayList<>();
	
	public StudentController() {
		
		students.add(new Student(1, "Ram", "Delhi", 75));
		students.add(new Student(2, "Rohit", "Latur", 65));
		students.add(new Student(3, "Kanak", "Patna", 78));
		students.add(new Student(4, "Abhilasha", "Kolkata", 44));
		students.add(new Student(5, "Chandrasekhar", "Mewar", 36));
		
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudentDetailsHandler() {
		return students;
	}
	
	@GetMapping("students/{roll}")
	public ResponseEntity<Student> getStudentByRoll(@PathVariable("roll") Integer roll) {
		
		Student s1 = null;
		
		for(Student st : students) {			
			if(st.getRoll() == roll) {
				s1 = st;
			}			
		}
		
		HttpHeaders hh = new  HttpHeaders();
		hh.add("jwt", "jkdfhskhflksdjflsd");
		hh.add("user", "admin");
		hh.add("hello", "abc");
		
		return new ResponseEntity<>(s1, hh, HttpStatus.OK);
	}
	
	
	@PostMapping("/students")
	public ResponseEntity<String> addStudentHandler(@RequestBody Student student) {
		students.add(student);
		return new ResponseEntity<String>("Student has been added successfully", HttpStatus.OK);
	}
	
	
	@PutMapping("/mystudents/{roll}")
	public ResponseEntity<String> updateStudentHandler1(@RequestBody Student student, @PathVariable("roll") Integer roll) {
		
		boolean flag = true;
		
		for(Student st : students) {
			if(st.getRoll() == roll) {
				st.setName(student.getName());
				st.setAddress(student.getAddress());
				st.setMarks(student.getMarks());
				flag = false;
			}
		}
		
		if(flag) {
			throw new IllegalArgumentException("Invalid roll " + roll);
		}
		
		return new ResponseEntity<String>("Student has been updated successfully...", HttpStatus.OK);
	}
	
	@DeleteMapping("/students/{r}")
	public ResponseEntity<String> deleteStudentByRollHandler(@PathVariable("r") Integer roll) {
		
		boolean flag = true;
		for(Student st : students) {
			if(st.getRoll() == roll) {
				students.remove(st);
				flag = false;
				break;
				
			}
		}
		
		if(flag == true) {
			throw new IllegalArgumentException("Invalid roll number");
		}
		
		return new ResponseEntity<String>("Student has been deleted successfully...", HttpStatus.OK);
	}
	
	
	@PutMapping("/students/{r}")
	public ResponseEntity<String> graceMarksHandler(@PathVariable("r") Integer roll, @RequestParam("gmarks") Integer gmarks) {
		
		boolean flag = true;
		for(Student st : students) {
			if(st.getRoll() == roll) {
				st.setMarks(st.getMarks() + gmarks);
				flag = false;
			}
		}
		
		if(flag) {
			throw new IllegalArgumentException("Invalid roll" + roll + " number");
		}
		
		return new ResponseEntity<String>("Marks updated successfully..." ,   HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	

}
