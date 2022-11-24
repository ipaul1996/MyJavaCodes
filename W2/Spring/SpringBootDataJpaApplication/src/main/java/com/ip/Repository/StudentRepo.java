package com.ip.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ip.Model.Student;
import com.ip.Model.StudentDTO;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	public List<Student> findByMarks(Integer marks);
	
	public List<Student> findByAddress(String address);
	
	@Query("select s.name from Student s where roll=?1")
	public String findNameByRoll(Integer roll);
	
	@Query("select s.name, s.marks from Student s where s.address=?1")
	public List<String> getNameAndMarksByAddress(String address);
	
	@Query("select new com.ip.Model.StudentDTO(s.name, s.marks) from Student s where s.address=?1")
	public List<StudentDTO> getNameAndMarksByAddress2(String address);
}
