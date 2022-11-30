package com.ip.all;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ip.utility.EMUtil;

public class Demo10 {

	public static void main(String[] args) {
		
	 EntityManager em =	EMUtil.getEM();
	 
	 Query q = em.createNamedQuery("account.getBalance");
	 q.setParameter("bal", 5000);
	 
	 List<Account> list = q.getResultList();
	 
	 for(Account acc : list) {
		 System.out.println("Account number is : " + acc.getAccno());
		 System.out.println("Account holder name is : " + acc.getName());
		 System.out.println("Balance in the account is : " + acc.getBalance());
		 
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
	 }

	}

}
