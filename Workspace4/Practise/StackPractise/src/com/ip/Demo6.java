package com.ip;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Demo6 {

	public static void main(String[] args) {
		
		//Deque
		Deque<Integer> dq = new LinkedList<>() ;
		//Deque<Integer> dq = new ArrayDeque<>();
		
		//Insert at the beginning
		dq.addFirst(1);
		dq.addFirst(5);
		dq.addFirst(6);
		dq.addFirst(1);
		dq.addFirst(10);
		dq.offerFirst(5);
		dq.push(6);  
		dq.push(9);
		dq.push(15);
		dq.push(6);	
		System.out.println(dq);  //[6, 15, 9, 6, 5, 10, 1, 6, 5, 1]
		
		//Insert at the end
		dq.addLast(25);
		dq.offerLast(35);
		dq.offer(40);
		dq.add(85);
		System.out.println(dq);  //[6, 15, 9, 6, 5, 10, 1, 6, 5, 1, 25, 35, 40, 85]
		
		//Beginning
		System.out.println(dq.getFirst());  //6
		System.out.println(dq.peekFirst());  //6
		System.out.println(dq.peek());  //6
		System.out.println(dq.element()); //6
		
		//End
		System.out.println(dq.getLast()); //85
		System.out.println(dq.peekLast());  //85
		
		//Remove from the beginning
		dq.removeFirst(); //6
		System.out.println(dq); //[15, 9, 6, 5, 10, 1, 6, 5, 1, 25, 35, 40, 85]
		
		dq.pollFirst();  //15
		System.out.println(dq);  //[9, 6, 5, 10, 1, 6, 5, 1, 25, 35, 40, 85]
		
		dq.poll(); //9
		System.out.println(dq); //[6, 5, 10, 1, 6, 5, 1, 25, 35, 40, 85]
		
		dq.pop();  //6
		System.out.println(dq);  //[5, 10, 1, 6, 5, 1, 25, 35, 40, 85]
		
		
		//Remove from the end	
		dq.removeLast(); //85
		System.out.println(dq); //[5, 10, 1, 6, 5, 1, 25, 35, 40]
		
		dq.pollLast();  //40
		System.out.println(dq);  //[5, 10, 1, 6, 5, 1, 25, 35]
		
		
		dq.removeFirstOccurrence(1);
		System.out.println(dq);  //[5, 10, 6, 5, 1, 25, 35]
		
		dq.removeLastOccurrence(5);
		System.out.println(dq); //[5, 10, 6, 1, 25, 35]
		
		
		
		
	}

}
