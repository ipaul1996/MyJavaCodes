package com.ip.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.ip.entities.Department;
import com.ip.entities.Employee;
import com.ip.utility.EMUtil;

public class Demo1 {
	
	public static void main(String[] args) {
		
		EntityManager em =  EMUtil.getEM();
		
		Employee e1 = new Employee();	
		e1.setEname("Avik");
		e1.setEsalary(56000);
		
		Department dept = em.find(Department.class, 3);
		
		System.out.println(dept);
		
		List<Employee> emps= dept.getEmps();
		
		em.getTransaction().begin();
		
		em.persist(e1);
		emps.add(e1);
//		em.merge(dept);
		
		em.getTransaction().commit();
		
		em.close();
	}

}
