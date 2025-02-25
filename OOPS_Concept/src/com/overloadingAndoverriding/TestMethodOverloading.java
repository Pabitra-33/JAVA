package com.overloadingAndoverriding;

//Class Adder contains overloaded methods to add integers  
class Adder {  
    // Method to add two integers  
    static int add(int a, int b) {  
        return a + b;  
    }  
    // Method to add three integers  
    static int add(int a, int b, int c) {  
        return a + b + c;  
    }  
}  
public class TestMethodOverloading {  
    public static void main(String[] args) {  
        // Calling the add method with two integers  
        System.out.println(Adder.add(11, 11)); // Output: 22  
        // Calling the add method with three integers  
        System.out.println(Adder.add(11, 11, 11)); // Output: 33  
    }  
}  