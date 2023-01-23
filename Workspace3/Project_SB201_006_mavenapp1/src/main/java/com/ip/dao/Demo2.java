package com.ip.dao;

import javax.persistence.EntityManager;

import com.ip.model.Department;
import com.ip.model.Employee;
import com.ip.utility.EMUtil;

public class Demo2 {
	
	public static void main(String[] args) {
		
		Department department = new Department();
		department.setdName("Tech");
		department.setdLocation("Bangalore");
		
		Employee e1 = new Employee();
		e1.setName("Asmita");
		e1.setSalary(95000);
		e1.setDept(department);
		
		Employee e2 = new Employee();
		e2.setName("Arpita");
		e2.setSalary(65000);
		e2.setDept(department);
		
		EntityManager em = EMUtil.getEM();
		
		em.getTransaction().begin();
		
		
		em.persist(e1);
		em.persist(e2);
		
		
		em.getTransaction().commit();
		
		em.close();
		
		
	}

}
