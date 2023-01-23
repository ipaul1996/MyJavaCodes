package com.ip.all;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.ip.utility.EMUtil;

public class Demo2 {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.getEM();
		
//		Getting a single record or more than one record
		String jpql = "select a from Account a WHERE a.name = :nm";
		
		TypedQuery<Account> q = em.createQuery(jpql, Account.class);
		
		q.setParameter("nm", "Ram");
		
		Account acc = q.getSingleResult();
		System.out.println(acc);
	}

}
