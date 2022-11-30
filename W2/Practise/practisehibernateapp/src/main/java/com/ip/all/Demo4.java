package com.ip.all;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ip.utility.EMUtil;

public class Demo4 {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.getEM();
		
//		   1 column 1 record
			String jpql = "select a.name from Account a WHERE accountno = :ano";
			Query q = em.createQuery(jpql);
			q.setParameter("ano", 1);
			
			List<String> list = q.getResultList();
			
			if(list.size() != 0l) {
				System.out.println("Account holder's name is : " + list.get(0));
			} else {
				System.out.println("Invalid account number");
			}
		
	}

}
