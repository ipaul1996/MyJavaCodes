package com.ip.dao;

import javax.persistence.EntityManager;

import com.ip.entities.Aadhar;
import com.ip.entities.Person;
import com.ip.utility.EMUtil;

public class Main {
	
	public static void main(String[] args) {
		
		EntityManager em =  EMUtil.getEM();
		
		Aadhar a1 = new Aadhar();
		a1.setState("WB");
		
		Person p1 = new Person();
		p1.setPname("Ram");	
		p1.setAddr(a1 );
		
		a1.setPerson(p1);
		
		em.getTransaction().begin();
		em.persist(p1);
		em.getTransaction().commit();
		
		em.close();
		
	}

}
