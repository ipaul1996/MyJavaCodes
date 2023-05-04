package com.ip;

import java.util.Arrays;
import java.util.Iterator;

public class MyTest5 {
	
	
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		Integer[] numbers = {1, 2, 3, 4, 5};

		// using iterator to iterate over array
		for (Iterator<Integer> iter = Arrays.asList(numbers).iterator(); iter.hasNext(); ) {
		    Integer num = iter.next();
		    System.out.println(num);
		}
	}

}
