package com.ip;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo2 {
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> list = new LinkedList<>();
		
		//******************************************************************************************************
		//From Collection
		list.add(1);   //boolean
		list.add(2);
		list.add(3);
		list.add(5);
		System.out.println(list);  //[1, 2, 3, 5]
		
		List<Integer> list1 = Arrays.asList(25, 26, 27);
		list.addAll(list1);   //true
		System.out.println(list);  //[1, 2, 3, 5, 25, 26, 27]
		
		
		//******************************************************************************************************
		//From List
		list.add(0, 11);    //void
		System.out.println(list); //[11, 1, 2, 3, 5, 25, 26, 27]
		
		list.add(3, 100);
		System.out.println(list); //[11, 1, 2, 100, 3, 5, 25, 26, 27]
		
		//******************************************************************************************************
		
		Integer i = 1;
		list.remove(i);  //Here it is taking object as argument - This remove method is in Collection interface(remove(object)) - removing element 1
		System.out.println(list); //[11, 2, 100, 3, 5, 25, 26, 27]
		
				
		list.remove(1); //Here it is taking index as argument - This remove method is present in List interface(remove(index)) - removing element at index 1
		System.out.println(list); //[11, 100, 3, 5, 25, 26, 27]
		
		//******************************************************************************************************
		
		list.clear();  //void
		
		//******************************************************************************************************
		//From LinkedList
		list.push(1); 	//void
		list.push(2);
		list.push(3);
		list.push(4);
		
		System.out.println(list);  //[4, 3, 2, 1]
		
		list.pop();  //4
		
		System.out.println(list); //[3, 2, 1]
		
		list.offer(5); //true
		System.out.println(list); //[3, 2, 1, 5]
		
		list.addFirst(6);  //void
		System.out.println(list);  //[6, 3, 2, 1, 5]
		
		list.offerFirst(7);  //true
		System.out.println(list);  //[7, 6, 3, 2, 1, 5]
		
		list.addLast(8);  //void
		System.out.println(list);  //[7, 6, 3, 2, 1, 5, 8]
		
		list.offerLast(9);  //true
		System.out.println(list);  //[7, 6, 3, 2, 1, 5, 8, 9]
		
		list.poll();  //7
		System.out.println(list); //[6, 3, 2, 1, 5, 8, 9]
		
		list.pollFirst();  //6
		System.out.println(list); //[3, 2, 1, 5, 8, 9]
		
		list.pollLast();  //9
		System.out.println(list); //[3, 2, 1, 5, 8]
		
		list.pop();  //3
		System.out.println(list);  //[2, 1, 5, 8]
		
		list.removeFirst();  //2
		System.out.println(list);  //[1, 5, 8]
		
		list.removeLast(); //8
		System.out.println(list); //[1, 5]
		
		list.push(7);
		list.push(9);
		list.push(11);
		list.push(12);
		list.push(17);
		list.push(25);
		list.push(13);
		list.push(11);
		list.push(30);
		list.push(35);
		list.push(13);
		list.push(15);
		
		System.out.println(list);   //[15, 13, 35, 30, 11, 13, 25, 17, 12, 11, 9, 7, 1, 5]
		
		list.removeFirstOccurrence(11);  //true
		System.out.println(list);  //[15, 13, 35, 30, 13, 25, 17, 12, 11, 9, 7, 1, 5]
		
		list.removeLastOccurrence(13);  //true
		System.out.println(list);  //[15, 13, 35, 30, 25, 17, 12, 11, 9, 7, 1, 5]
		
		System.out.println(list.element()); //15
		
		System.out.println(list.getFirst());  //15
		
		System.out.println(list.getLast()); //5
		
		System.out.println(list.peek());  //15
		
		System.out.println(list.peekFirst());  //15
		
		System.out.println(list.peekLast());  //5
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		

	}

}
