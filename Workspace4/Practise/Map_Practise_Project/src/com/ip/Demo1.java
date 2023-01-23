package com.ip;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		Map<Integer, String> hm4 = new HashMap<>();
		
		
		hm.put(1, "Ram");
		hm.put(2, "Radhe");
		hm.put(3, "Golan");
		hm.put(4, "Shakti");
		
		hm.put(5, null);
		hm.put(6, null);
		
		hm.put(null, "Gagan");
		hm.put(null, "Ravi");
		
		System.out.println(hm);
		System.out.println(hm.size());
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(7, "Raja");
		hm1.put(8, "Nitin");
		hm1.put(9, "Ajab");
		
		String ss = hm1.putIfAbsent(8, "Alu"); //If the specified key is not already associated with a value (or is mapped to null) 
																	//associates it with the given value and returns null, else returns the current value.
		System.out.println(ss); 		//Nitin
		
		String ss1 = hm1.putIfAbsent(10, "Rajesh");
		System.out.println(ss1); //null
		
		
		HashMap<Integer, String> hm2 = (HashMap<Integer, String>)hm1.clone();
		
		
		
		hm1.putAll(hm); //Copies all of the mappings from the specified map to this map		
		System.out.println(hm1);
		
		
		
//		Getting Keys
		Set<Integer> keys = hm.keySet(); //Returns a  Set view of the keys contained in this map.
		
//		Iteration
		for(Integer i : keys) {
			System.out.println(i);
		}
		
		
		
//		Getting values
		Collection<String> c = hm.values(); //Returns a  Collection view of the values contained in this map
		
//		Iteration
		for(String s : c) {
			System.out.println(s);
		}
		
		
		
//		Getting keys and values both
		Set<Map.Entry<Integer, String>> keyValue = hm.entrySet();   //Returns a  Set view of the mappings contained in
																										    	//	this map(set of Entry).

		
//		Iteration
		for(Map.Entry<Integer, String> me : keyValue) {
			System.out.println(me.getKey() + "=" + me.getValue());
//			me.setValue("Amar");  It is used to replace the value corresponding to this entry with the specified value.

		}
		
		
		
	
		
//		Getting value of a particular key
		String s = hm.get(1);
		System.out.println(s); //Ram
		
		System.out.println(hm.get(9)); //null as the key is not present
		
		
		
//		Finding a key is present or not
		System.out.println(hm.containsKey(2)); //true
		System.out.println(hm.containsKey(8)); //false
		
		
		
//		Finding a value is present or not
		System.out.println(hm.containsValue("Ram")); //true
		System.out.println(hm.containsValue("Rohit")); //false
		
		
		
		System.out.println(hm.isEmpty()); //false
		
		
		
		String str = hm.remove(2); //Removes the entry from the map with key = 2. If key is not present it returns null
		System.out.println(str); //Radhe
		
		
		
		boolean b = hm.remove(3, "Shakti"); //Removes the entry from the map with key = 3, if its value is Shakti
		System.out.println(b); //false
		
		
		
		String s1 = hm.replace(5, "Pratap"); //Replaces the entry for the specified key only
																	//if it is currently mapped to some value(mapped value can also be null)
																	//If the key is not present it returns null
		System.out.println(s1); //Ram
		
		
		
		boolean b1 = hm.replace(4, "Shakti", "Vikrant"); //Replaces the entry for the specified key only 
																						//if currently mapped to the specified value.
		System.out.println(b1); //true
		
		
		
		hm.replaceAll((k, v) -> "Member " + v); //Replaces each entry's value with the result of invoking the given function 
																		  //on that entry until all entries have been processed or the function throws 
																		//an exception. Exceptions thrown by the function are relayed to the caller.
		
		
		
		hm.forEach((k, v) -> System.out.println(k + " " + v)); //Performs the given action for each entry in this map until all 
																								//entries have been processed or the action throws an 
																								//exception. Unless otherwise specified by the implementing 
																								//class, actions are performed in the order of entry set iteration 
																								//(if an iteration order is specified.)Exceptions thrown by 
																								//the action are relayed to the caller.
		
		hm.clear(); //Removes all of the mappings from this map.The map will be empty after this call returns.
		System.out.println(hm);
	}

}
