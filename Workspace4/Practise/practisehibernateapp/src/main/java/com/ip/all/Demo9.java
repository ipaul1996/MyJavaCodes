package com.ip.all;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ip.utility.EMUtil;

public class Demo9 {
	
	public static void main(String[] args) {
		
		EntityManager em =  EMUtil.getEM();
//		Aggregate Functions:
//		Sum(Long)
		String jpql = "select sum(balance) from Account";
		Query q = em.createQuery(jpql);
		
		long sum = (Long)q.getSingleResult();
		
		System.out.println("Sum is : " + sum);
		
		
		
		
//		Count(Long)
		String jpql1 = "select count(balance) from Account";
		Query q1 = em.createQuery(jpql1);
		
		long count = (Long)q1.getSingleResult();
		
		System.out.println("Count is : " + count);
		
		
		
		
//		Average(Double)
		String jpql2 = "select avg(balance) from Account";
		Query q2 = em.createQuery(jpql2);
		
		double avg = (Double)q2.getSingleResult();
		
		System.out.println("Average is : " + avg);
		
		
		
		
//		Minimum(Intger)
		String jpql3 = "select min(balance) from Account";
		Query q3 = em.createQuery(jpql3);
		
		int min = (Integer)q3.getSingleResult();
		
		System.out.println("Minimum is : " + min);
		
		
		
		
//		Maximum(Integer)
		String jpql4 = "select max(balance) from Account";
		Query q4 = em.createQuery(jpql4);
		
		int max = (Integer)q4.getSingleResult();
		
		System.out.println("Maximum is : " + max);
	   
	}

		
		
	

}
