package com.ip.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ip.Service.StudentService;

@RestController
@RequestMapping("/studentApp")
public class StudentController {
	
	@Autowired
	private StudentService ss;

}
