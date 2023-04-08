package com.ip;

class Life extends Object {
	
	public void hello() {
		System.out.println("Hello in Life");
	}
	
}

class Animal extends Life {
   public void makeSound() {
      System.out.println("The animal makes a sound");
   }
}


class Cat extends Animal {
   @Override
   public void makeSound() {
      System.out.println("Meow");
   }
   
   public void hello() {
	   System.out.println("Hello in cat");
	  
   }
}

	public class Main {
	   public static void main(String[] args) {
//	      Animal animal = new Animal();
//	      animal.makeSound();  // Output: The animal makes a sound
//
//	      Cat cat = new Cat();
//	      cat.makeSound();  // Output: Meow
		   
		   Animal animal = new Cat();
		   
		   animal.makeSound();
		   animal.hello();
	   }
	}

