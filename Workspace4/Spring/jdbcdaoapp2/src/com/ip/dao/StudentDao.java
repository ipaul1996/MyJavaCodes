package com.ip.dao;

import java.util.List;

import com.ip.exceptions.CourseException;
import com.ip.exceptions.StudentException;
import com.ip.model.Student;

public interface StudentDao {
	
		public String registerStudent(Student student);
		
		public Student loginStudent(String email, String password) throws StudentException;
		
		public Student getStudentByRoll(int roll) throws StudentException;
		
		public List<Student> getAllStudentDetails() throws StudentException;
		
		public String registerStudentInCourse(int roll, int cid) throws StudentException, CourseException;
		
		public List<StudentDTO> getAllStudentByCourseName(String cname) throws CourseException;

}
