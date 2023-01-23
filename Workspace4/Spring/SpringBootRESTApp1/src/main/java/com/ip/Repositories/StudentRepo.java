package com.ip.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ip.model.Student;
import com.ip.model.StudentDTO;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	public List<Student> findByAddress(String address);
	
	@Query("select new StudentDTO(s.name, s.address) from com.ip.model.StudentDTO s where roll=?1")
	public StudentDTO getStudentDTO(Integer roll);
	
	@Query("select new StudentDTO(s.name, s.address) from com.ip.model.StudentDTO s where address=?1")
	public List<StudentDTO> getAllstudentByAddress(String address);
}
