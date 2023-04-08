package com.ip.Test2;

import java.util.ArrayList;
import java.util.List;

class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }
    
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
	
    private String breed;
    
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
        System.out.println("Dog constructor called");
        bark();
    }
    
    public void bark() {
        System.out.println(name + " is barking.");
    }
    
    public void walk() {
        System.out.println(name + " is walkiing.");
    }
    
    public String getBreed() {
    	return this.breed;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Fido", "Golden Retriever");
        myDog.eat();
        myDog.walk();
        System.out.println(myDog.getBreed());
        
        A a = new A();
        List<Integer> list = new ArrayList<>();
    }
}

