package com.ip;

class MyClass {
    static {
        System.out.println("Static block 1");
    }
    
    {
        System.out.println("Non-static block 1");
    }
    
    static {
        System.out.println("Static block 2");
    }
    
    {
        System.out.println("Non-static block 2");
    }
    
    public MyClass() {
        System.out.println("Constructor");
    }
}


