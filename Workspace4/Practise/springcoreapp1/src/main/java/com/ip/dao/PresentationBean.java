package com.ip.dao;

public class PresentationBean {
	
	private ServiceBean sbean;

	public void setSbean(ServiceBean sbean) {
		this.sbean = sbean;
	}
	
	public void present() {
		sbean.calaculateInterest();
		
		System.out.println("Pesenting the calculated interesest in PL");
	}

}
