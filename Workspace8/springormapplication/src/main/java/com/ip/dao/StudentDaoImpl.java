package com.ip.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.ip.entities.Student;

public class StudentDaoImpl implements StudentDao {
	
	private HibernateTemplate hTemplate;

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}


	@Transactional
	public String registerStudent(Student student) {
		
		String message = null;
		
		hTemplate.save(student);
		
		message = "Student has been inserted successfully...";
		
		return message;
	}
	
	

}
