package com.ip;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demo {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		List<Integer> revList = reverse(list);
		System.out.println(revList);
		
	}
		public static List<Integer> reverse(List<Integer> list) {
		    int s = 0;
		    int e = list.size()-1;
		    
		    while(s < e) {
		        
		        swap(list, s, e);
		        s++;
		        e--;
		        
		    }
		    
		    return list;
		    
		    
		}
		
		public static List<Integer> swap(List<Integer> list, int x, int y) {
		    
		    Integer current = list.get(x);
		    
		    list.set(x, list.get(y));	    
		    list.set(y, current);
		    
		    return list;
		}
		
	}

