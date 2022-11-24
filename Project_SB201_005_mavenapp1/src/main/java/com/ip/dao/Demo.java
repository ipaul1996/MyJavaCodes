package com.ip.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.ip.model.Account;
import com.ip.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.getEM();
		
//		Typed Query		
		
//		String jpql = "from Account where name='Rohit'";
//		
//		TypedQuery<Account> q = em.createQuery(jpql, Account.class);
//		
//		Account acc = q.getSingleResult();
//		
//		System.out.println(acc);
		
		
//		Bulk Update
		
//		String jpql = "update Account set balance=balance+500 ";
//		
//		Query q = em.createQuery(jpql);
//		
//		em.getTransaction().begin();
//		
//		int x = q.executeUpdate();
//		
//		em.getTransaction().commit();
//		
//		System.out.println(x + " records updated successfully");
//		
//		em.close();
		
		
//		Positional Parameter
		
//		String jpql = "update Account set balance = balance + ?4 where name = ?5";
//		
//		Query q = em.createQuery(jpql);
//		
//		q.setParameter(4, 350);
//		q.setParameter(5, "Shyamali");
//		
//		em.getTransaction().begin();
//		int x = q.executeUpdate();
//		em.getTransaction().commit();
//		
//		System.out.println(x + " record updated");
		
		
//		Named Parameter
		
//		String jpql = "update Account set balance = balance + :bal where name = :nam";
//		
//		Query q = em.createQuery(jpql);
//		
//		q.setParameter("bal", 3000);
//		q.setParameter("nam", "Dipesh");
//		
//		em.getTransaction().begin();
//		
//		int x = q.executeUpdate();
//		
//		em.getTransaction().commit();
//		
//		System.out.println(x + " records updated");
//		
//		em.close();
		
//		Accessing only one column(1 row 1 column)
		
//		String jpql = "select name from Account where accno=:acc";
//		
//		Query q = em.createQuery(jpql);
//		
//		q.setParameter("acc", 2);
//		
//		String name = (String) q.getSingleResult();
//		
//		System.out.println(name);
		
		
		
//		multiple rows and 1 column
		
//		String jpql = "select balance from Account";
//		
//		Query q = em.createQuery(jpql);
//		
//		List<Integer> list = q.getResultList();
//		
//		System.out.println(list);
		
		
		
//		few columns and all rows
		
//		String jpql = "select name, balance from Account";
//		
//		Query q = em.createQuery(jpql);
//		
//		List<Object[]> list = q.getResultList();
//		
//		for(Object[] or : list) {
//			System.out.println("Name is :" + or[0]);
//			System.out.println("Balance is :" + or[1]);
//			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
//		}
		
		
		
//		few columns with single record
		
//		String jpql = "select accno, balance from Account where name =:nam";
//		
//		Query q = em.createQuery(jpql);
//		
//		q.setParameter("nam", "Shyamali");
//		
//		Object obj = q.getSingleResult();
//		
//		Object[] arr = (Object[]) obj;
//		
//		System.out.println("Account number is : " + arr[0]);
//		System.out.println("Balance is : " + arr[1]);
//		
//		em.close();
		
		
		
//		Aggregate functions		
//		min,max, count: Integer
//		avg : Double
//		sum : Long
		
//		String jpql = "select sum(balance) from Account";
//		
//		TypedQuery<Long> q = em.createQuery(jpql, Long.class);
//		
//		Long res = q.getSingleResult();
//		
//		System.out.println(res);
//		
//		em.close();
		
		
		
//		Named Query
		
//		Query q = em.createNamedQuery("account.getBalance");
//		
//		q.setParameter("bal", 80000);
//		
//		List<Account> list = q.getResultList();
//		
//		System.out.println(list);
//		
//		em.close();
		
		
		
//		Native Query(Hence the query becomes database dependent)
		
//		String nq = "select * from account";
//		
//		Query q = em.createNativeQuery(nq, Account.class);
//		
//		List<Account> list = q.getResultList();
//		
//		System.out.println(list);
//		
//		em.close();
		
		
		
		
//		Named Native Query
		
		Query q = em.createNamedQuery("account.allAccount");
		
		List<Account> list = q.getResultList();
		
		System.out.println(list);
		
		
	}

}
