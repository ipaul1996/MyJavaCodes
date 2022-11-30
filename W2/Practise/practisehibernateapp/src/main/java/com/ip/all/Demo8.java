package com.ip.all;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ip.utility.EMUtil;

public class Demo8 {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.getEM();
		
//		few columns multiple records
		String jpql = "select a.accno, a.name from Account a";
		Query q = em.createQuery(jpql);
		
		List<Object[]> list = q.getResultList();
		
		for(Object[] or : list) {
			System.out.println("Account Number Is : " + or[0]);
			System.out.println("Name Is : " + or[1]);
			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		}
	}

}
