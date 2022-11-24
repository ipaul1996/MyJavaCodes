package com.masai.Service;

import java.util.List;

import com.masai.Exceptions.StudentException;
import com.masai.Model.Student;
import com.masai.Model.StudentDTO;

public interface StudentService {

	public Student registerStudent(Student student);

	public Student getStudentByRoll(Integer roll) throws StudentException;

	public List<Student> getStudentByAddress(String address) throws StudentException;

	public StudentDTO getStudentDTO(Integer roll) throws StudentException;

	public List<StudentDTO> getAllStudenDTObyAddress(String Address) throws StudentException;

	public List<Student> getAllStudents() throws StudentException;
	
	public Student updateStudent(Integer roll, Student student) throws StudentException;

	public Student deleteStudent(Integer roll) throws StudentException;
}
