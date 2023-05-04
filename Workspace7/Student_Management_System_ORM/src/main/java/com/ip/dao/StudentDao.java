package com.ip.dao;

import java.util.List;

import com.ip.entities.Student;

public interface StudentDao {
	
	public String registerStudent(Student student);
	
	
	public Student getstudentByRoll(int roll);
	
	
	public String deleteStudent(int roll);
	
	
	public String updateName(int roll, String name);
	
	
	public Student loginStudent(String email, String password);
	
	
	public List<Student> getAllStudentDetails();

}
