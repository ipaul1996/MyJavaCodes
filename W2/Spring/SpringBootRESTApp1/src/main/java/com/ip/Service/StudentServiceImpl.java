package com.ip.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ip.Exeptions.StudentException;
import com.ip.Repositories.StudentRepo;
import com.ip.model.Student;
import com.ip.model.StudentDTO;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo sRepo;

	@Override
	public Student registerStudent(Student student) {
		Student s1 = sRepo.save(student);
		return s1;
	}

	@Override
	public Student getStudentByRoll(Integer roll) throws StudentException {
		
		Optional<Student> st = sRepo.findById(roll);
		
		if(!st.isPresent())
			throw new StudentException("Student not found");
		
		return st.get();
		
	}

	@Override
	public List<Student> getStudentByAddress(String address) throws StudentException {
		List<Student> students = sRepo.findByAddress(address);
		
		if(students.size() == 0) 
			throw new StudentException("No student found with given address");
		return students;
	}

	@Override
	public StudentDTO getStudentDTO(Integer roll) throws StudentException {
		
		StudentDTO sdt = sRepo.getStudentDTO(roll);
		
		if(sdt == null)
			throw new StudentException("Student not found");
		
		return sdt;
	}

	@Override
	public List<StudentDTO> getAllStudentDTOByAddress(String address) throws StudentException {
		List<StudentDTO> lsdt = sRepo.getAllstudentByAddress(address);
		
		if(lsdt.size() == 0) 
			throw new StudentException("No student found with the given address");
		
		return lsdt;
	}

	@Override
	public List<Student> getAllStudent() throws StudentException {
		List<Student> students = sRepo.findAll();
		
		if(students.size() == 0) {
			throw new StudentException("No student found");
		}
		return students;
	}

	@Override
	public Student updateStudent(Integer roll, Student student) throws StudentException {
		Optional<Student> st = sRepo.findById(roll);
		
		if(!st.isPresent())
			throw new StudentException("Can not update, as the student is not found");
			
		 Student s2 = sRepo.save(student);
		 
		return s2;
	}

	@Override
	public Student deleteStudent(Integer roll) throws StudentException {
		Optional<Student> st = sRepo.findById(roll);
		
		if(!st.isPresent())
			throw new StudentException("Can not delete, as the student is not found");
			
		sRepo.deleteById(roll);
		 
		return st.get();
	}

}
