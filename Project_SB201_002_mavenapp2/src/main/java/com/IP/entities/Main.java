package com.IP.entities;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static EntityManagerFactory getEMF() {
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("studentUnit");
		
		return emf;
		
	}
	
}
