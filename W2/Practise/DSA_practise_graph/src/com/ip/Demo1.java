package com.ip;
import java.util.*;

//Create a graph
class Demo1{
	
	    public static void createGraph(int n,int[][] arr){
	    	
	        HashMap<Integer, List<Integer>> map = new HashMap<>();
	        
	        for (int i = 1; i <= n; i++) {
	            map.put(i, new ArrayList<>());
	        }
	       
	        for (int i = 0; i < arr.length; i++) {
	            int x = arr[i][0];
	            int y = arr[i][1];
	            map.get(x).add(y);
	            map.get(y).add(x);
	        }
	        System.out.println(map);
	    }
	    
	    public static void main(String[] args){
	    	
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the number of nodes present in the graph:");
	        int n = s.nextInt();
	        
	        System.out.println("Enter the length of the relationship array: ");
	         int m = s.nextInt();
	        int[][] arr = new int[m][2];
	        
	        for (int i = 0; i < m; i++) {
	        	
	        	System.out.println("Enter the 1st element of " +i +"-th subarray of relationship array: ");
	            arr[i][0] = s.nextInt();
	        	
	        	System.out.println("Enter the 2nd element of " +i +"-th subarray of relationship array:");
	            arr[i][1] = s.nextInt();
	        }
	        
	        createGraph(n,arr);
	        
	    }
	}

//Input: 
//n = 10
//m = 9
//int[][] arr = {{1, 2}, {1, 4}, {1, 6}, {2, 3}, {6, 7}, {7, 8}, {7, 9}, {9, 10}, {3, 5}}

//Output of createGraph:
//Adjacency Matrix: {1=[2, 4, 6], 2=[1, 3], 3=[2, 5], 4=[1], 5=[3], 6=[1, 7], 7=[6, 8, 9], 8=[7], 9=[7, 10], 10=[9]}



