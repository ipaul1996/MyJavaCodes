package com.ip.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.ip.Exception.StudentException;
import com.ip.Model.Student;
import com.ip.Model.StudentDTO;
import com.ip.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService sService;

	@PostMapping("/student")
	public ResponseEntity<Student> registerStudentHandler(@RequestBody Student student) throws StudentException {
		
		Student s1 = sService.registerStudent(student);
		
		return new ResponseEntity<Student>(s1, HttpStatus.CREATED);
	}
	
	@GetMapping("/students/{roll}")
	public ResponseEntity<Student> getStudentByRollHandler(@PathVariable("roll") Integer roll) throws StudentException {
		
		Student student = sService.getStudentByRoll(roll);
		
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	
	@DeleteMapping("/students/{roll}")
	public ResponseEntity<Student> deleteStudentByRollHandler(@PathVariable("roll") Integer roll) throws StudentException {
		
		Student student = sService.deleteStudentByRoll(roll);
		
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	
	@PutMapping("/student")
	public ResponseEntity<Student> updateStudentHandler(@RequestBody Student student) throws StudentException {
		
		Student student1 = sService.updateStudentDetails(student);
		
		return new ResponseEntity<Student>(student1, HttpStatus.OK);
	}
	
	@PutMapping("/student/{roll}")
	public ResponseEntity<Student> updateStudentMarksHandler(@PathVariable Integer roll, 
						@RequestParam("graceMarks") Integer graceMarks) throws StudentException {
		
		Student student = sService.updateStudentMarks(roll, graceMarks);
		
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	
	@GetMapping("/students/marks")
	public ResponseEntity<List<Student>> getStudentByMarksHandler(@RequestParam("marks") Integer marks) throws StudentException {
		
		List<Student> students = sService.getStudentByMarks(marks);
		
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}
	
	@GetMapping("/students/address")
	public ResponseEntity<List<Student>> getStudentByAddressHandler(@RequestParam("address") String address) throws StudentException {
		
		List<Student> students = sService.getStudentByAddress(address);
		
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}
	
	@GetMapping("/studentName")
	public ResponseEntity<String> getStudentNameByRollHandler(@RequestParam("roll") Integer roll) throws StudentException {
		
		String name = sService.getStudentNameByRoll(roll);
		
		return new ResponseEntity<String>(name, HttpStatus.OK);
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<String>> getNameAndMarksByAddressHandler(@RequestParam("address") String address) throws StudentException {
		
		List<String> list = sService.getNameAndMarksByAddress(address);
		
		return new ResponseEntity<List<String>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/students2")
	public ResponseEntity<List<StudentDTO>> getNameAndMarksByAddressHandler2(@RequestParam("address") String address) throws StudentException {
		
		List<StudentDTO> list = sService.getNameAndMarksByAddress2(address);
		
		return new ResponseEntity<List<StudentDTO>>(list, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
}
