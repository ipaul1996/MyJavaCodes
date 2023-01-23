package com.ip.Service;

import java.util.List;

import com.ip.Exeptions.StudentException;
import com.ip.model.Student;
import com.ip.model.StudentDTO;

public interface StudentService {
	
	public Student registerStudent(Student student);
	
	public Student getStudentByRoll(Integer roll) throws StudentException;
	
	public List<Student> getStudentByAddress(String address) throws StudentException;
	
	public StudentDTO getStudentDTO(Integer roll) throws StudentException;
	
	public List<StudentDTO> getAllStudentDTOByAddress(String address) throws StudentException;
	
	public List<Student> getAllStudent() throws StudentException;
	
	public Student updateStudent(Integer roll, Student student) throws StudentException;
	
	public Student deleteStudent(Integer roll) throws StudentException;

}
