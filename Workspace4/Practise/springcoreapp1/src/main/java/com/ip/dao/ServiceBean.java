package com.ip.dao;

public class ServiceBean {
	
	private DaoBean dao;
	
	
	public void setDao(DaoBean dao) {
		this.dao = dao;
	}



	public void calaculateInterest() {
		
		dao.findAccount();
		System.out.println("Interest calculated in Service Layer..");
	}

}
