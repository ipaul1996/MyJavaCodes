package com.IP.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class Demo3 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Main.getEMF();
		EntityManager em = emf.createEntityManager();
		
		Student student = em.find(Student.class, 1);
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		em.remove(student);
		
		et.commit();
		
		em.close();
		
		System.out.println("Student removed...");
		
	}
}
