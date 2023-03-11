package com.ip;

import java.util.Stack;

public class Demo8 {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		System.out.println(st); //[1, 2, 3, 4, 5, 6]
		
		st.pop(); //6
		System.out.println(st); //[1, 2, 3, 4, 5]
		
		System.out.println(st.peek());  //5
		
		System.out.println(st.empty()); //false
		
		System.out.println(st.search(5)); //1
		System.out.println(st.search(3)); //3
		System.out.println(st.search(2)); //4
		

	}

}
