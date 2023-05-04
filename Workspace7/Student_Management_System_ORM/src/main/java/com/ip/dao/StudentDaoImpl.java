package com.ip.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.ip.entities.Student;
import com.ip.utility.EMUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public String registerStudent(Student student) {
		
		EntityManager em = EMUtil.getEM();
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		em.persist(student);
		
		et.commit();
		em.close();
		
		return "Student saved sucessfully...";
	}

	
	
	@Override
	public Student getstudentByRoll(int roll) {
		
		EntityManager em = EMUtil.getEM();
		
		Student student = em.find(Student.class, roll);
		
		return student;
	}
	
	
	@Override
	public String deleteStudent(int roll) {
		
		String message = null;
		
		EntityManager em = EMUtil.getEM();
		
		Student student = em.find(Student.class, roll);
		
		em.getTransaction().begin();
		
		em.remove(student);
		
		em.getTransaction().commit();
		
		em.close();
		
		message = "Student deleted sucessfully...";
		
		return message;
	}



	
	
	@Override
	public String updateName(int roll, String name) {
		
		String message = "Unable to update the student name";
		
		EntityManager em = EMUtil.getEM();
		
		Student student = em.find(Student.class, roll);
		
		if(student != null) {
			
			em.getTransaction().begin();
			
			student.setName(name);
			
			testTransaction(roll, em);
			
			em.getTransaction().commit();
			
			em.close();
		}
		
		message = "Student name has been updated sucessfully...";
		
		return message;
	}
	
	
	public void testTransaction(int roll, EntityManager em) {
		
		Student s = em.find(Student.class, roll);
		
		System.out.println("Student details: " + s);
		
	}
	
	
	@Override
	public Student loginStudent(String email, String password) {
		
		Student student = null;
		
		EntityManager em = EMUtil.getEM();
		
		String jpql = "FROM Student s WHERE s.email = :em AND s.password = :pass";
		
		Query q = em.createQuery(jpql);
		
		q.setParameter("em", email);
		q.setParameter("pass", password);
		
	    student = (Student)q.getSingleResult();
		
		return student;
	}


	@Override
	public List<Student> getAllStudentDetails() {
		
		List<Student> list = null;
		
		EntityManager em = EMUtil.getEM();
		
		String jpql = "FROM Student";
		
		Query q = em.createQuery(jpql);
		
		list = q.getResultList();
		
		return list;
	}



	

	
	

	

}
