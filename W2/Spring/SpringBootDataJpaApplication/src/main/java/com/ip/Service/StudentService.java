package com.ip.Service;

import java.util.List;

import com.ip.Exception.StudentException;
import com.ip.Model.Student;
import com.ip.Model.StudentDTO;

public interface StudentService {

	public Student registerStudent(Student student);
	
	public Student getStudentByRoll(Integer roll) throws StudentException;
	
	public Student deleteStudentByRoll(Integer roll) throws StudentException;
	
	public Student updateStudentDetails(Student student) throws StudentException;
	
	public Student updateStudentMarks(Integer roll, Integer graceMarks) throws StudentException;
	
	public List<Student> getStudentByMarks(Integer marks) throws StudentException;
	
	public List<Student> getStudentByAddress(String address) throws StudentException;
	
	public String getStudentNameByRoll(Integer roll) throws StudentException;
	
	public List<String> getNameAndMarksByAddress(String address) throws StudentException;
	
	public List<StudentDTO> getNameAndMarksByAddress2(String address) throws StudentException;
	
}
