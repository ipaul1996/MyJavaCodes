package com.ip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

class MyOperator implements UnaryOperator<Integer> {

	@Override
	public Integer apply(Integer t) {
		return t * t;
	}
	
}

public class Demo10 {

	public static void main(String[] args) {
		
		//List - ArrayList Implementation
		List<Integer> list = new ArrayList<>();
		
		//From Collection Interface
		list.add(1);  //true
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println(list);  //[1, 2, 3, 4, 5, 6]
		
		List<Integer> list2 = Arrays.asList(7, 8, 9, 10);
		List<Integer> list3 = Arrays.asList(11, 12, 13);
		
		list.addAll(list2);
		System.out.println(list);  //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		list.addAll(5, list3);   //This method is from List
		System.out.println(list);  //[1, 2, 3, 4, 5, 11, 12, 13, 6, 7, 8, 9, 10]
		
		Integer i1 = 3;
		list.remove(i1);  //true
		System.out.println(list);  //[1, 2, 4, 5, 11, 12, 13, 6, 7, 8, 9, 10]
		
		list.removeIf(e -> e > 7 ? true : false);  //Remove all the elements from the list that are greater than 7
		System.out.println(list);  //[1, 2, 4, 5, 6, 7]
		
		list.retainAll(Arrays.asList(4, 5, 6, 7));  //Removes all the elements other than 4, 5, 6, 7
		System.out.println(list);  //[4, 5, 6, 7]
		
		list.removeAll(Arrays.asList(6, 7));  //Removes 6, 7
		System.out.println(list);  //[4, 5]
		
		System.out.println(list.contains(5));  //true
		
		System.out.println(list.containsAll(Arrays.asList(4, 5)));  //true
		System.out.println(list.containsAll(Arrays.asList(4, 5, 6, 8)));  //false
		
		Object[] arr =  list3.toArray();
		System.out.println(arr instanceof Object[]); //true
		System.out.println(arr instanceof Object);  //true
		System.out.println(arr instanceof Integer[]);  //false
		
		Integer[] arr1 = new Integer[1];
		Integer[] arr2 = new Integer[0];
		Integer[] arr3 = new Integer[10];
		
		Integer[] arr4 = list3.toArray(arr1);
		System.out.println(arr4 instanceof Integer[]);  //true
		// System.out.println(arr4 instanceof Integer);  //compile time error
		System.out.println(Arrays.toString(arr4));  //[11, 12, 13]
		
		Integer[] arr5 = list3.toArray(arr2);
		System.out.println(Arrays.toString(arr5));  //[11, 12, 13]
		
		Integer[] arr6 = list3.toArray(arr3);
		System.out.println(Arrays.toString(arr6));  //[11, 12, 13, null, null, null, null, null, null, null]
		
		list.clear();
		
		//*********************************************************************************************************************
		
		//From List
		list.add(0, 1);
		list.add(1, 2);
		list.add(2, 3);
		list.add(1, 10);
		list.add(0, 12);
		
		System.out.println(list);  //[12, 1, 10, 2, 3]
		
		List<Integer> myList = Arrays.asList(11, 12, 13);
		list.addAll(2, myList);
		System.out.println(list);  //[12, 1, 11, 12, 13, 10, 2, 3]
		
		list.set(0, -12);
		System.out.println(list);  //[-12, 1, 11, 12, 13, 10, 2, 3]
		
		list.replaceAll(new MyOperator());	
		System.out.println(list); //[144, 1, 121, 144, 169, 100, 4, 9]
		
		System.out.println(list.get(1));  //1
		System.out.println(list.indexOf(144)); //0
		System.out.println(list.lastIndexOf(144)); //3
		
		list.sort((e1, e2) -> e1 > e2  ? +1 :  e1 < e2 ? -1 : 0 );
		System.out.println(list);  //[1, 4, 9, 100, 121, 144, 144, 169]
		
		List<Integer> mySubList = list.subList(0, 4);  //Last Index exclusive
		System.out.println(mySubList);  //[1, 4, 9, 100]
		
		mySubList.remove(1);  //4
		System.out.println(mySubList);  //[1, 9, 100]
		
		//******************************************************************************************
		// Creating unmodifiable List
		List<Integer> unmodifiableList = List.of(1, 2, 3, 4, 5);
		System.out.println(unmodifiableList);  //unmodifiable List
		
		//******************************************************************************************
		// ArrayList Class - Implements List interface
		//All the above methods of List are applicable. Other than these method it has following class specific methods,
		
		ArrayList<Integer> al= new ArrayList<>();
		//ensureCapcity(int minCapacity), trimToSize()
		
		//******************************************************************************************
		// LinkedList Class - Implements List interface
		//All the above methods of List are applicable.
		List<Integer> listL1 = new LinkedList<>();
		LinkedList<Integer> listL2 = new LinkedList<>();  //Here methods of Queue and Deque are also applicable.

	}

}
