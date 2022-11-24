package com.ip.all;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.ip.utility.EMUtil;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.getEM();
		
//		String jpql = "select a from Account a";
//		
//		Query q = em.createQuery(jpql);
//		
//		List<Account> list = q.getResultList();
//		
//		for(Account acc : list) {
//			System.out.println(acc);
//		}
		
		String jpql = "select a from Account a WHERE a.name = ?1";
		
		TypedQuery<Account> q = em.createQuery(jpql, Account.class);
		
		q.setParameter(1, "Ram");
		
		Account acc = q.getSingleResult();
		
		System.out.println(acc);
		
	   
	}

}
