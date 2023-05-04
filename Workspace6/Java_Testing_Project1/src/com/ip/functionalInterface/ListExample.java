package com.ip.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        System.out.println("Original list: " + fruits);

        // Replace all elements with their upper case versions
        UnaryOperator<String> operator = s -> s.toUpperCase();
        fruits.replaceAll(operator);
        System.out.println("List after replacing all elements with their upper case versions: " + fruits);
    }
}
