package com.IP.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class Demo2 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Main.getEMF();		
		EntityManager em = emf.createEntityManager();
		
		Student student = new Student(4, "Aman", 78);
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		em.persist(student);
		
		et.commit();
		
		em.close();
		
		System.out.println("Objcet saved in the database");
	}
}
