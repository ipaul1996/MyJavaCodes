package com.ip.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ip.model.Department;
import com.ip.model.Employee;
import com.ip.utility.EMUtil;

public class Demo1 {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.getEM();
		
		Department d1 = new Department();
		d1.setdName("HR");
		d1.setdLocation("Kolkata");
		
		Employee e1 = new Employee();		
		e1.setName("Raj");
		e1.setSalary(50000);
		e1.setDept(d1);
		
		Employee e2 = new Employee();		
		e2.setName("Sandy");
		e2.setSalary(35000);
		e2.setDept(d1);
		
		
		
		d1.getEmps().add(e1);
		d1.getEmps().add(e2);
		
		em.getTransaction().begin();
		
//		em.persist(d1);
		em.persist(e1);
		em.persist(e2);
		
	
		em.getTransaction().commit();
		
		em.close();
		
		
		
//		adding another employee in the existing department
		
//		Employee e3 = new Employee();		
//		e3.setName("Asmita");
//		e3.setSalary(85000);
//		
//		Department dept = em.find(Department.class, 1);
//		
//		em.getTransaction().begin();
//		
//		dept.getEmps().add(e3);
//		
//		em.getTransaction().commit();
//		
//		em.close();
		
		
//		getting all the Employees from the Department "HR"
		
//		String jpql = "select emps from Department where dName = 'HR'";
//		
//		Query q = em.createQuery(jpql);
//		
//		List<Employee> list = q.getResultList();
//		
//		System.out.println(list);
	}

}
