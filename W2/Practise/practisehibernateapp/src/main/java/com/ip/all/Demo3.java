package com.ip.all;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ip.utility.EMUtil;

public class Demo3 {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.getEM();
		
//		Updating multiple records
		String jpql = "update Account set balance = balance + :bal where balance < :b";
		Query q = em.createQuery(jpql);
		q.setParameter("bal", 500);
		q.setParameter("b", 6000);
		
		em.getTransaction().begin();
		int x = q.executeUpdate();
		em.getTransaction().commit();
		
		em.close();
		
		if(x>0) {
			System.out.println(x + " Records updated");
		} else {
			System.out.println("Unable to update the account");
		}
		
	}

}
