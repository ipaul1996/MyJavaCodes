package com.ip.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.ip.entities.Student;
import com.ip.utility.EMUtil;

public class StudentDaoImpl implements StudentDao {

	public String registerStudent(Student student) {
		
		String str = null;
		
		EntityManager em = EMUtil.getEM();
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(student);
		et.commit();
		
		em.close();
		
		str = "Student has been registerd successfully...";
		
		return str;
	}

	
	
	public Student getStudent(int roll) {
		
		Student s = null;
		
		EntityManager em = EMUtil.getEM();
		
		s = em.find(Student.class, roll);
		
		return s;
	}

}
