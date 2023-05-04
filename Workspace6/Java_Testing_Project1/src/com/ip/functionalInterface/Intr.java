package com.ip.functionalInterface;

@FunctionalInterface
public interface Intr {
	
	public static final int X = 5;
	
	public abstract void funA();
	
	public abstract String toString();
	
	default void funI() {
		System.out.println("Hello");
	}
	
	static void funZ() {
		System.out.println("Hello world!");
	}
	
	

}
