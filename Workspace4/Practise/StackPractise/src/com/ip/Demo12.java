package com.ip;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo12 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(1);
		ts.add(3);
		ts.add(10);
		ts.add(6);
		ts.add(4);
		
		System.out.println(ts);  //[1, 3, 4, 6, 10]
		
		System.out.println(ts.pollFirst()); //1
		System.out.println(ts); //[3, 4, 6, 10]
		
		System.out.println(ts.pollFirst()); //3
		System.out.println(ts); //[4, 6, 10]
		
		System.out.println(ts.first());  //4
		System.out.println(ts.last());  //10
		
		System.out.println(ts.ceiling(6)); //6 //Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
		System.out.println(ts.ceiling(4)); //4
		System.out.println(ts.ceiling(11)); //null
		System.out.println(ts.ceiling(5)); //6
//		System.out.println(ts.ceiling(null)); //Throws exception
		
		System.out.println(ts.higher(6)); //10  //Returns the least element in this set strictly greater than the given element, or null if there is no such element.
		System.out.println(ts.higher(4)); //6
		System.out.println(ts.higher(11)); //null
		System.out.println(ts.higher(5)); //6
//		System.out.println(ts.higher(null)); //Throws exception
		
		System.out.println(ts.floor(6));  //6   //Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
		System.out.println(ts.floor(4)); //4
		System.out.println(ts.floor(3)); //null
		System.out.println(ts.floor(5)); //4
//		System.out.println(ts.floor(null)); //Throws exception
		
		System.out.println(ts.lower(6)); //4
		System.out.println(ts.lower(4));  //null
		System.out.println(ts.lower(3));  //null
		System.out.println(ts.lower(5));  //4
//		System.out.println(ts.lower(null));  //Throws exception
		
		Comparator<? super Integer> comp = ts.comparator();  //Returns the comparator used to order the elements in this set, or null if this set uses the natural ordering of its elements.
		System.out.println(comp);  //null - Here Set uses natural ordering
		
	}

}
