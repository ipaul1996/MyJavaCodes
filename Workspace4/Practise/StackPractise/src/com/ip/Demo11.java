package com.ip;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo11 {

	public static void main(String[] args) {
		
		//Set - HashSet class implements Set
		Set<Integer> set = new HashSet<>();  //Insertion order is not preserved, unique elements - elements should be comparable, null allowed
		
		set.add(1);  //true
		set.add(2);
		set.add(3);
		set.add(3); //false - duplicate
		set.add(5);
		set.add(null);
		set.add(null); //false
		
		
		System.out.println(set);  //[null, 1, 2, 3, 5]
		
		List<Integer> list2 = Arrays.asList(7, 8, 8, 10);
		Set<Integer> set2 = new HashSet<>(list2);
		System.out.println(set2); //[7, 8, 10]

		
		set.addAll(set2);
		System.out.println(set);  //[null, 1, 2, 3, 5, 7, 8, 10]

		set.remove(3);  //true
		System.out.println(set);  //[null, 1, 2, 5, 7, 8, 10]
		
		//set.removeIf(e -> e > 7 ? true : false); 
		//This gives a NullPointerException as it can't execute the intValue() method on null during comparisons

		set.remove(null);
		System.out.println(set);  //[1, 2, 5, 7, 8, 10]
		
		set.removeIf(e -> e > 7 ? true : false);
		System.out.println(set);  //[1, 2, 5, 7]
		
		set.retainAll(Arrays.asList(4, 5, 6, 7));  //Removes all the elements other than 4, 5, 6, 7
		System.out.println(set);  //[5, 7]
		
		set.removeAll(Arrays.asList(5));  //Removes 5
		System.out.println(set);  //[7]
		
		System.out.println(set.contains(7));  //true
		
		System.out.println(set.containsAll(Arrays.asList(7)));  //true
		System.out.println(set.containsAll(Arrays.asList(4, 5, 6, 8)));  //false
		
		Object[] arr =  set2.toArray();
		System.out.println(arr instanceof Object[]); //true
		System.out.println(arr instanceof Object);  //true
		System.out.println(arr instanceof Integer[]);  //false
		
		Integer[] arr1 = new Integer[1];
		Integer[] arr2 = new Integer[0];
		Integer[] arr3 = new Integer[10];
		
		Integer[] arr4 = set2.toArray(arr1);
		System.out.println(arr4 instanceof Integer[]);  //true
//		 System.out.println(arr4 instanceof Integer);  //compile time error
		System.out.println(Arrays.toString(arr4));  //[7, 8, 10]
		
		Integer[] arr5 = set2.toArray(arr2);
		System.out.println(Arrays.toString(arr5));  //[7, 8, 10]
		
		Integer[] arr6 = set2.toArray(arr3);
		System.out.println(Arrays.toString(arr6));  //[7, 8, 10, null, null, null, null, null, null, null]
		
		set.clear();
		
		//***************************************************************************************************
		//HashSet
		HashSet<Integer> hs = new HashSet<>();
		//All the above methods are applicable
		
		//***************************************************************************************************
		//LinkedHashSet
		Set<Integer> set3 = new LinkedHashSet<>();
		//Insertion order is preserved, unique elements - elements should be comparable, null allowed
		//All the above methods are applicable
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		//All the above methods are applicable
		
		//***************************************************************************************************
		//TreeSet
		//Here all the above methods are applicable but elements will be in sorted order
		//TreeSet has various method but with the Set interface reference we can only call Set interface or its super interface methods
		Set<Integer> set4 = new TreeSet<>();
		set4.add(5);  //true
		set4.add(2);
		set4.add(4);
		set4.add(1); 
		set4.add(2); //false - duplicate
		
		System.out.println(set4); //[1, 2, 4, 5]
		
		
	}

}
