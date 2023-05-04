package com.ip.dao;

import java.util.List;

import com.ip.dto.StudentDTO;
import com.ip.exception.CourseException;
import com.ip.exception.StudentException;
import com.ip.model.Course;
import com.ip.model.Student;

public interface StudentCourseDAO {
	
	public String registerStudent(Student student) throws StudentException;
	
	
	public Student getStudentByRoll(int roll) throws StudentException;
	
	
	public Student loginStudent(String email, String password) throws StudentException;
	
	
	public List<Student> getAllStudentDetails() throws StudentException;
	
	
	public String createCourse(Course course) throws CourseException;
	
	
	public String registerStudentInsideCourse(int roll, int cid) throws StudentException, CourseException;
	
	
	public List<StudentDTO> getStudentsByCourseName() throws StudentException, CourseException;

}
