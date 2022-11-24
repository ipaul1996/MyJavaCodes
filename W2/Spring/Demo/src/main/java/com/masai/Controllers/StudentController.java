package com.masai.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exceptions.StudentException;
import com.masai.Model.Student;
import com.masai.Model.StudentDTO;
import com.masai.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService ss;

	@PostMapping("/students")
	public ResponseEntity<Student> addNewStudentHandler(@Valid @RequestBody Student student) {
		Student s = ss.registerStudent(student);
		HttpHeaders hh = new HttpHeaders();
		hh.add("key", "hskhfskd");
		return new ResponseEntity<Student>(s, hh, HttpStatus.CREATED);
	}

	@GetMapping("/students/{roll}")
	public ResponseEntity<Student> getStudentByRollHandler(@PathVariable("roll") Integer roll) throws StudentException {
		Student s = ss.getStudentByRoll(roll);
		return new ResponseEntity<Student>(s, HttpStatus.OK);
	}

	@GetMapping("/students/address/{add}")
	public ResponseEntity<List<Student>> getStudentByAddress(@PathVariable("add") String address)
			throws StudentException {
		List<Student> slist = ss.getStudentByAddress(address);
		return new ResponseEntity<List<Student>>(slist, HttpStatus.OK);
	}

	
	@GetMapping("/students/dto/{roll}")
	public ResponseEntity<StudentDTO> getStudentDTOByRoll(@PathVariable("roll") Integer roll) throws StudentException {
		StudentDTO s = ss.getStudentDTO(roll);
		return new ResponseEntity<StudentDTO>(s, HttpStatus.OK);
	}
	
	@GetMapping("/studens/dto/address/{add}")
	public ResponseEntity<List<StudentDTO>> getStudentDTObyAddress(@PathVariable("add") String address)
			throws StudentException {
		List<StudentDTO> slist = ss.getAllStudenDTObyAddress(address);
		return new ResponseEntity<List<StudentDTO>>(slist, HttpStatus.OK);
	}



}
