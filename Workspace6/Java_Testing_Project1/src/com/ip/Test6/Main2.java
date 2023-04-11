package com.ip.Test6;

import java.util.Arrays;

public class Main2 {
	
	public static void main(String[] args) {
		
		Item[] items= Item.values();
		System.out.println(Arrays.toString(items));
		
		for(Item item : items) {
			System.out.println(item+" price is : " + item.getPrice());
		}	
		
		Item item = Item.PENCIL;
		item.ordinal();
	}

}
