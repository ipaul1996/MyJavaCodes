package com.ip.Test6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Kunal", "Ajay", "Kaju", "Mohit");
		List<String> shallowList = list.subList(0, list.size());
		List<String> deepList = new ArrayList<>(list);
		
		System.out.println("Original List before any modification: " + list);
		System.out.println("Shallow List before any modification: " + shallowList);
		System.out.println("Deep List before any modification: " + deepList);
		
		shallowList.set(0, "Asmita");
		deepList.set(1, "Naren");
		
		
		System.out.println("Original List after modification: " + list);
		System.out.println("Shallow List after modification: " + shallowList);
		System.out.println("Deep List after modification: " + deepList);
		
		//Original List before any modification: [Kunal, Ajay, Kaju, Mohit]
		//Shallow List before any modification: [Kunal, Ajay, Kaju, Mohit]
		//Deep List before any modification: [Kunal, Ajay, Kaju, Mohit]
		//Original List after modification: [Asmita, Ajay, Kaju, Mohit]
		//Shallow List after modification: [Asmita, Ajay, Kaju, Mohit]
		//Deep List after modification: [Kunal, Naren, Kaju, Mohit]

		//Whatever changes we make in the shallow copy is reflected in the original list
		
		Collection<Integer> c = new ArrayList<>();
		Collection<Integer> c1 = new LinkedList<>();
		
		System.out.println(c.iterator().getClass().getName());
		c1.iterator();
		
		System.out.println(Arrays.asList("Kunal", "Ajay", "Kaju", "Mohit").getClass().getName());
		
		Integer[] arr = new Integer[] {1, 2, 3};
		
		
	}

}
