package com.ip.dao;

import javax.persistence.EntityManager;

import com.ip.entities.Address;
import com.ip.entities.Student;
import com.ip.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.getEM();
		
//		Student s = new Student();
//		
//		s.setName("ram");
//		s.setMarks(90);
//		s.getAddresses().add(new Address("WB", "Kol", "70007", "addr1"));
//		s.getAddresses().add(new Address("Delhi", "Delhi", "85412", "addr2"));
//		s.getAddresses().add(new Address("TN", "Coimbatore", "45784102", "addr3"));
//		
//		em.getTransaction().begin();
//		em.persist(s);
//		em.getTransaction().commit();
		
		Student s1 = em.find(Student.class, 1);
		
		System.out.println(s1.getMarks());
		em.close();
		System.out.println(s1.getAddresses());
		
		

	}

}
