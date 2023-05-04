package com.ip.Test6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo3 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(3);
		
		Iterator<Integer> itr = list.iterator();
		
		System.out.println(itr.next());
		
		list.add(6);
		
		System.out.println(itr.next()); //java.util.ConcurrentModificationException
		
		//The reason for this behavior is that the Iterator object in Java is fail-fast, 
		//which means that it detects any structural modification to the collection 
		//while iterating over it and throws the ConcurrentModificationException to prevent 
		//any undefined behavior that might result from the modification.
		
 		
	}
	
	

}











