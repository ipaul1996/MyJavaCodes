package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exceptions.StudentException;
import com.masai.Model.Student;
import com.masai.Model.StudentDTO;
import com.masai.Repositories.StudentRepo;

//Service Layer
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo sRepo;

//	private StudentRepo sRepo;

	@Override
	public Student registerStudent(Student student) {
		Student savedStudent = sRepo.save(student);
		return savedStudent;
	}

	@Override
	public Student getStudentByRoll(Integer roll) throws StudentException {
//		Optional<Student> student = sRepo.findById(roll);
//		if (!student.isPresent())
//			throw new StudentException("Student Not Found.");
//
//		return student.get();

		return sRepo.findById(roll).orElseThrow(() -> new StudentException("Student Not Found."));
		
	}

	@Override
	public List<Student> getStudentByAddress(String address) throws StudentException {
//		List<String[]> slist = sRepo.getStudentByAddress(address);
		
		List<Student> slist = sRepo.findByAddress(address);
		
		if (slist.size() == 0)
			throw new StudentException("NO students found");

		// ["1,harshal,pune,350","2,suresh,odisa,480","3,Indrajit,loc,500"]
//		List<Student> studentList = new ArrayList<>();
//		
//		for (String s : slist) {
//			String[] str = s.split(",");
//			//["1","harshal","pune","350"]
//			Student st = new Student(Integer.parseInt(str[0]), str[1], str[2], Integer.parseInt(str[3]));
//			
//			studentList.add(st);
//		}
		
		return slist;
	}

	@Override
	public StudentDTO getStudentDTO(Integer roll) throws StudentException {
		StudentDTO sd = sRepo.getStudentDTO(roll);

		return sd;
	}

	@Override
	public List<StudentDTO> getAllStudenDTObyAddress(String Address) throws StudentException {
		List<StudentDTO> slist = sRepo.getStudentDTOByAddress(Address);
		return slist;
	}

	@Override
	public List<Student> getAllStudents() throws StudentException {
		List<Student> students = sRepo.findAll();
		if (students.size() == 0)
			throw new StudentException("Studetns Not Found..");

		return students;
	}

	@Override
	public Student updateStudent(Integer roll, Student student) throws StudentException {
		Optional<Student> s = sRepo.findById(roll);

		if (!s.isPresent())
			throw new StudentException("Student not found with roll" + roll);

		Student s2 = sRepo.save(student);

		return s2;
	}

	@Override
	public Student deleteStudent(Integer roll) throws StudentException {
		Optional<Student> s = sRepo.findById(roll);

		if (!s.isPresent())
			throw new StudentException("Student not found with roll" + roll);

		sRepo.deleteById(roll);

		return s.get();
	}

}
