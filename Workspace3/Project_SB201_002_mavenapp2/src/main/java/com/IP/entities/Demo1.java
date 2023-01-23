package com.IP.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Demo1 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Main.getEMF();
		
		EntityManager em = emf.createEntityManager();
		
		
		Student student = em.find(Student.class, 1);
		
		if(student != null)
			System.out.println(student);
		else
			System.out.println("Record not found");
		
		em.close();
	}
}
