package com.ip.Test1;

class ParentClass {
	   public static String staticVariable = "ParentClass static variable";

	   public static void staticMethod() {
	      System.out.println("ParentClass static method called.");
	   }
	}

public class ChildClass extends ParentClass {
	
   void myMethod() {
	   System.out.println(super.staticVariable); // Access parent class static variable
	    super.staticMethod(); // Call parent class static method
   }
   
   public static void main(String[] args) {
      
	   ChildClass ch = new ChildClass();
	   
	   ch.myMethod();
   }
   
}

