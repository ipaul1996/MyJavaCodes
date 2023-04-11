package com.ip.Test6;

public enum Item {
	
	SUGER, SALT, PENCIL(5), PEN(10), SHARPNER(30);
	
	int price;
	
	private Item() {
		this.price=20;
	}
	
	private Item(int price) {
		this.price=price;
	}
	
	
	public int getPrice() {	
		return this.price;
	}

}
