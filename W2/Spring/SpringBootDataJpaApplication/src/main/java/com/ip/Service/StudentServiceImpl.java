package com.ip.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ip.Exception.StudentException;
import com.ip.Model.Student;
import com.ip.Model.StudentDTO;
import com.ip.Repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo sRepo;

	@Override
	public Student registerStudent(Student student) {

		return sRepo.save(student);
	}

	@Override
	public Student getStudentByRoll(Integer roll) throws StudentException {
		
		return sRepo.findById(roll)
					.orElseThrow(() -> new StudentException("Student not found"));
		
	}

	@Override
	public Student deleteStudentByRoll(Integer roll) throws StudentException {
		
		Optional<Student> student = sRepo.findById(roll);
		
		if(student.isPresent()) {
			sRepo.deleteById(roll);
			return student.get();
			
		} else throw new StudentException("Student not found");
	}

	@Override
	public Student updateStudentDetails(Student student) throws StudentException {
		
		Integer roll = student.getRoll();
		
		Optional<Student> student1 = sRepo.findById(roll);
		
		if(student1.isPresent()) {
			return sRepo.save(student);
			
		} else throw new StudentException("Invalid Student Details");
	}

	@Override
	public Student updateStudentMarks(Integer roll, Integer graceMarks) throws StudentException {
		
		Optional<Student> student =  sRepo.findById(roll);
		
		if(student.isPresent()) {
			student.get().setMarks(student.get().getMarks()+graceMarks);
			return sRepo.save(student.get());
		} else throw new StudentException("Invalid roll number");
		
	}

	@Override
	public List<Student> getStudentByMarks(Integer marks) throws StudentException {
		
		List<Student> students = sRepo.findByMarks(marks);
		
		if(students.isEmpty()) {
			throw new StudentException("No student found with the given marks");
			
		} 
		
		return students;
		
	}

	@Override
	public List<Student> getStudentByAddress(String address) throws StudentException {
		
		List<Student> students = sRepo.findByAddress(address);
		
		if(students.size() == 0) {
			throw new StudentException("Student does not exists with the given address");
		}
		
		return students;
	}

	@Override
	public String getStudentNameByRoll(Integer roll) throws StudentException {
		String name = sRepo.findNameByRoll(roll);
		
		if(name != null) {
			return name;
		} else throw new StudentException("Student not found with the roll " + roll);
		
	}

	@Override
	public List<String> getNameAndMarksByAddress(String address) throws StudentException {
		
		List<String> list = sRepo.getNameAndMarksByAddress(address);
		
		if(list.size() == 0) {
			throw new StudentException("Student not found with the given address");
		}
		return list;
	}

	@Override
	public List<StudentDTO> getNameAndMarksByAddress2(String address) throws StudentException {

		List<StudentDTO> list = sRepo.getNameAndMarksByAddress2(address);
		
		if(list.size() == 0) {
			throw new StudentException("Student not found with the given address");
		}
		
		return list;
	}

	
}
