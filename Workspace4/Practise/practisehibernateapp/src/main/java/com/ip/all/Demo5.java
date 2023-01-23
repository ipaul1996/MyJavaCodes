package com.ip.all;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ip.utility.EMUtil;

public class Demo5 {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.getEM();
		
//		1 column multiple records
		String jpql = "select a.balance from Account a";
		Query q = em.createQuery(jpql);
		
		List<Integer> list = q.getResultList();
		
		if(!list.isEmpty()) {
			System.out.println(list);
		} else {
			System.out.println("No balance found");
		}
		
	}

}
