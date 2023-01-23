package com.ip.all;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.ip.utility.EMUtil;

public class Demo7 {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.getEM();
		
//		few columns 1 record(With TypedQuery)
		String jpql = "select a.balance, a.name from Account a where accno = :an";
		TypedQuery<Object[]> q = em.createQuery(jpql, Object[].class);
		q.setParameter("an", 1);
		
		Object[] or = q.getSingleResult();
		
		System.out.println("Name is : " + or[1].toString().toUpperCase());
		System.out.println("Balance is: " + or[0]);
	}

}
