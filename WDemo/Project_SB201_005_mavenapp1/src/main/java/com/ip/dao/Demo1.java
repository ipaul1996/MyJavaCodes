package com.ip.dao;

import javax.persistence.EntityManager;

import com.ip.model.Address;
import com.ip.model.Employee;
import com.ip.utility.EMUtil;

public class Demo1 {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.getEM();
		
		Employee emp = new Employee();
		
		emp.setName("Asmita");
		emp.setSalary(25000);
		emp.setAddr(new Address("WB", "Kolkata", "85000"));
		emp.setOfficeAddr(new Address("Karnataka", "Bangalore", "98205"));
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("done...");
				
	}

}
