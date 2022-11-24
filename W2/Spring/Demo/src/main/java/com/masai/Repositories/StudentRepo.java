package com.masai.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.Model.Student;
import com.masai.Model.StudentDTO;

//Data Access Layer
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

//	@Query("select s from com.masai.Model.Student s where s.address=?1")
//	public List<String[]> getStudentByAddress(String address);
	
	public List<Student> findByAddress(String address);

	@Query("select new com.masai.Model.StudentDTO(s.name,s.address) from com.masai.Model.Student s where s.roll=?1")
	public StudentDTO getStudentDTO(Integer roll);

	@Query("select new com.masai.Model.StudentDTO(s.name,s.address) from com.masai.Model.Student s where address=?1")
	public List<StudentDTO> getStudentDTOByAddress(String address);
}

