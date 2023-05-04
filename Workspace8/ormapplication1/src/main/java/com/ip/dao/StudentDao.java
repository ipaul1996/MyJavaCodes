package com.ip.dao;

import com.ip.entities.Student;

public interface StudentDao {
	
	public String registerStudent(Student student);
	
	public Student getStudent(int roll);

}
