package com.ip.dao;

import javax.persistence.EntityManager;

import com.ip.entities.ContractualEmployee;
import com.ip.entities.Employee;
import com.ip.entities.SalariedEmployee;
import com.ip.utility.EMUtil;

public class Demo1 {
	
	public static void main(String[] args) {
		
		EntityManager em =  EMUtil.getEM();
		
//		This emp is not an Entity so it can't be persisted
//		Employee emp = new Employee();
//		emp.setName("Ajay");
		
		ContractualEmployee cemp = new ContractualEmployee();
		cemp.setName("Rahim");
		cemp.setNoOfWorkingDay(5);
		cemp.setCostPerDay(1000);
		
		SalariedEmployee semp = new SalariedEmployee();
		semp.setName("Akbar");
		semp.setSalary(38000);
		
		em.getTransaction().begin();
//		em.persist(emp);
		em.persist(cemp);
		em.persist(semp);
		em.getTransaction().commit();
		
		em.close();
			
	}

}
