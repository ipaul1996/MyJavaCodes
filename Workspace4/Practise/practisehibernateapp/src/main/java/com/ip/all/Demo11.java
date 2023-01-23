package com.ip.all;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ip.utility.EMUtil;

public class Demo11 {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.getEM();
		
		String sql = "select * from myaccount";
		Query q = em.createNativeQuery(sql, Account.class);
		
		List<Account> list = q.getResultList();
		
		for(Account acc : list) {
			 System.out.println("Account number is : " + acc.getAccno());
			 System.out.println("Account holder name is : " + acc.getName());
			 System.out.println("Balance in the account is : " + acc.getBalance());
			 
			 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 }
		
	}

}
