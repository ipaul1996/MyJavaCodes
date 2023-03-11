package com.ip;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Demo5 {
	
	public static void main(String[] args) {
		
		//Queue represented by a Deque  - FIFO Principle
		Deque<Integer> dq = new LinkedList<>();
		//Deque<Integer> dq = new ArrayDeque<>();
		
		dq.offer(1);
		dq.offer(10);
		dq.offer(20);
		dq.offer(25);
		dq.offer(30);
		dq.offer(45);
		dq.addLast(3);
		dq.add(4);
		dq.offerLast(5);
			
		System.out.println(dq);  //[1, 10, 20, 25, 30, 45, 3, 4, 5]
		
		System.out.println(dq.element());  //1
		System.out.println(dq.peek());   //1
		System.out.println(dq.peekFirst());  //1
		System.out.println(dq.getFirst());  //1
		
		dq.poll(); //1
		System.out.println(dq); //[10, 20, 25, 30, 45, 3, 4, 5]
		
		dq.remove(); //10
		System.out.println(dq); //[20, 25, 30, 45, 3, 4, 5]
		
		dq.removeFirst();  //20
		System.out.println(dq); //[25, 30, 45, 3, 4, 5]
		
		dq.pollFirst();  //25
		System.out.println(dq);  //[30, 45, 3, 4, 5]
		
		dq.pop();  //30
		System.out.println(dq);  //[45, 3, 4, 5]
		
		
	}

}
