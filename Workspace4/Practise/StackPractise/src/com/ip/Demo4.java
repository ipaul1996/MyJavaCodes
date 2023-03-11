package com.ip;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Demo4 {
	
	public static void main(String[] args) {
		
		//Stack represented by Deque - LIFO Principle
		
		Deque<Integer> dq = new LinkedList<>();
		//Deque<Integer> dq = new ArrayDeque<>();
		
		dq.push(1); 	//void
		dq.push(2);
		dq.push(3);
		dq.push(4);
		dq.push(5);
		dq.push(6);
		dq.offerFirst(7);
		dq.addFirst(8);
		
		System.out.println(dq);  //[8, 7, 6, 5, 4, 3, 2, 1]
		
		//Stack represented by Deque
		dq.pop();  //8
		System.out.println(dq); //[7, 6, 5, 4, 3, 2, 1]
		
		dq.remove(); //7
		System.out.println(dq); //[6, 5, 4, 3, 2, 1]
		
		dq.removeFirst(); //6
		System.out.println(dq); //[5, 4, 3, 2, 1]
		
		dq.poll(); //5
		System.out.println(dq); //[ 4, 3, 2, 1]
		
		dq.pollFirst(); //4
		System.out.println(dq); //[3, 2, 1]
		
		System.out.println(dq.peek());  //3
		System.out.println(dq.peekFirst()); //3
		System.out.println(dq.getFirst()); //3
		
		
	}

}
