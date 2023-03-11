package com.ip;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demo7 {
	
	public static void main(String[] args) {
		
				//Queue Interface, LinkedList Implementation - FIFO
				Queue<Integer> queue = new LinkedList<>();
				
				//From Collection
				queue.add(1);   //boolean
				queue.add(2);
				queue.add(3);
				queue.add(5);
				System.out.println(queue);  //[1, 2, 3, 5]
						
				List<Integer> list2 = Arrays.asList(25, 26, 27);
				queue.addAll(list2);   //true
				System.out.println(queue);  //[1, 2, 3, 5, 25, 26, 27]
				
				queue.remove(1);  //true  - Collection interface method remove(obj)
				System.out.println(queue);  //[2, 3, 5, 25, 26, 27]
			
				//******************************************************************************************************
				
				queue.clear(); //void
				
				//******************************************************************************************************
				//From Queue
				
				queue.offer(1);  //true
				queue.offer(2);
				queue.offer(3);
				queue.offer(4);
				queue.offer(5);
				
				System.out.println(queue); //[1, 2, 3, 4, 5]
				
				queue.poll();  //1
				System.out.println(queue);  //[2, 3, 4, 5]
				
				queue.remove(); //2
				System.out.println(queue);  //[3, 4, 5]
				
				System.out.println(queue.peek());  //3
				
				System.out.println(queue.element()); //3
				
				System.out.println(queue);  //[3, 4, 5]
				
				
				//******************************************************************************************************
		
	}

}
