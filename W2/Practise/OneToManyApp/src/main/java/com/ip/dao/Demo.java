package com.ip.dao;

import javax.persistence.EntityManager;

import com.ip.entities.Department;
import com.ip.entities.Employee;
import com.ip.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.getEM();
		
		Department dept = new Department();
		dept.setDname("HR");
		
		Employee e1 = new Employee();
		e1.setEname("Raju");
		e1.setEsalary(5000);
		
		Employee e2 = new Employee();
		e2.setEname("Kaju");
		e2.setEsalary(6000);
		
		dept.getEmps().add(e1);
		dept.getEmps().add(e2);
		
		em.getTransaction().begin();
		em.persist(e1);
		em.persist(e2);
		em.persist(dept);
		em.getTransaction().commit();
		
		em.close();
		
	}
}
