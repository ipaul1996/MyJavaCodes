package com.ip.Test6;

import java.util.Arrays;
import java.util.Objects;

//Shallow Copy of an Object
public class Student implements Cloneable {
	
	private int roll;
	
	private String name;
	
	private String[] favouriteColors;

	public Student(int roll, String name, String[] favColor) {
		super();
		this.roll = roll;
		this.name = name;
		this.favouriteColors = favColor;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public String[] getFavouriteColors() {
		return favouriteColors;
	}

	public void setFavouriteColors(String[] favouriteColors) {
		this.favouriteColors = favouriteColors;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(favouriteColors);
		result = prime * result + Objects.hash(name, roll);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Arrays.equals(favouriteColors, other.favouriteColors) && Objects.equals(name, other.name)
				&& roll == other.roll;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		
		
		try {
			Student s1 = new Student(1, "Amit", new String[] {"Blue", "White"});
			Student s1Clone = (Student)s1.clone(); //No constructor is called
			//Default implementation of clone() method in Java provides "shallow copy" of the 
			//object because it creates a copy of Object by creating a new instance and then 
			//copying content by assignment
			
			System.out.println(s1 == s1Clone); //false-->s1 and s1Clone refer to two different objects
			
			System.out.println(s1.getClass() == s1Clone.getClass()); //true 
			//Both the objects belong to the same class i.e., Student. Not mandatory
			
			System.out.println(s1.equals(s1Clone)); //true
			//Both the objects are exact copies. Not mandatory
			
			System.out.println(s1.getFavouriteColors() == s1Clone.getFavouriteColors()); //true
			//String array type reference variable favouriteColors in both the instances referring to the
			//same array(arrays are mutable objects). Here the same array is shared by both the instances. 
			//So, if we make changes in the array in any instance it will be reflected in the 
			//other instance also, which is shown below:
			
			s1Clone.getFavouriteColors()[0] = "Black";
			System.out.println(s1.getFavouriteColors()[0]); //Black
			
			//Both s1Clone and s1 have a name field of type String pointing to the same object "Amit"
			s1Clone.setName("Kaju");
			//As Strings are immutable objects, when we have changed the name field from "Amit" to "Kaju"
			//in s1Clone then String "Amit" itself does not get modified but a new String "Kaju" has created
			//and assigned to the name field of s1Clone but name field of s1 instance still points to the "Amit" String
			System.out.println(s1.getName()); //Amit
			
			//As we know in the shallow copy fields gets initialized by assignment i.e, if a primitive 
			//value assigned from an instance variable of the original object to an instance variable 
			//of the cloned object then a separate copy of primitive value is created. Hence changing 
			//roll field in one instance will not affect other instance
			s1Clone.setRoll(100);
			System.out.println(s1.getRoll()); //1
			
			
			//So in case of a shallow copy, if the instance variables are of primitive types then in 
			//the original and in the clone they have separate copies, but if they are of reference type
			//they share common object, changes in one instance will reflect in others 
			//Strings and wrapper classes are of reference type, but still if we make any changes in 
			//one instance will not reflect in other instance as they are immutable
			
		} catch (CloneNotSupportedException e) {  //If Student class does not implement Cloneable interface
												  //then we get CloneNotSupportedException e
			e.printStackTrace();
		}
		
	}

}
