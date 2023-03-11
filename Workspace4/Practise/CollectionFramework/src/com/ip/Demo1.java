package com.ip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class Demo1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<>(100);
		list.add(1);
		list.add(2);
		list.add(5);
		
		Object[] arr1 = list.toArray();
		Integer[] arr2 = list.toArray(new Integer[1]);
		Integer[] arr3 = list.toArray(new Integer[3]);
		Integer[] arr4 = list.toArray(new Integer[10]);
		
		System.out.println(Arrays.toString(arr1)); //[1, 2, 5]
		System.out.println(Arrays.toString(arr2)); //[1, 2, 5]
		System.out.println(Arrays.toString(arr3)); //[1, 2, 5]
		System.out.println(Arrays.toString(arr4)); //[1, 2, 5, null, null, null, null, null, null, null]
		
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		st.pop();
		
		System.out.println(st);
		
		
//		System.out.println(list);
		
		
		
//		LinkedList<Integer> list1 = new LinkedList<>();
//		list1.add(1);
//		list1.add(2);
//		list1.add(5);
//		list1.offer(6);
//		list1.offerFirst(7);
//		list1.addFirst(0);
//		list1.push(9);
//		
//		System.out.println(list1.get(2));
//		System.out.println(list1);
		
	}

}
