package com.ip.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ip.entities.Employee;
import com.ip.utility.EMUtil;

public class Demo2 {
	
	public static void main(String[] args) {
		
	  EntityManager em =  EMUtil.getEM();
	  
	  String jpql = "select emps from Department where dname = 'HR'";  
	  Query q = em.createQuery(jpql);
	  List<Employee> employees =  q.getResultList();
	  
	  employees.forEach(e -> System.out.println(e));
	}

}
