package com.ip.Test6;

enum Fruit {
    APPLE,
    BANANA,
    ORANGE,
    PINEAPPLE
}

public class Example {
    public static void main(String[] args) {
        Fruit myFruit1 = Fruit.APPLE;
        Fruit myFruit2 = Fruit.BANANA;
        int result = myFruit1.compareTo(myFruit2);
        System.out.println(result);
    }
}
