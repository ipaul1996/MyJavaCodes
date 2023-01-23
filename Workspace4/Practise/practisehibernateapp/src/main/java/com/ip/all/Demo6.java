package com.ip.all;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ip.utility.EMUtil;

public class Demo6 {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.getEM();
		
//		few columns 1 record
		String jpql = "select a.balance, a.name from Account a where accno = :an";
		Query q = em.createQuery(jpql);
		q.setParameter("an", 1);
		
		Object[] or = (Object[])q.getSingleResult();
		
		System.out.println("Name is : " + or[1].toString().toUpperCase());
		System.out.println("Balance is: " + or[0]);
		
	}

}
