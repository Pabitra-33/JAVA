package com.abstraction;

abstract class Animals {
    String name;
    
    // Constructor
    Animals(String name) { 
        this.name = name;
    }

    abstract void sound(); // Abstract method

    void display() { // Non-abstract method
        System.out.println("Name: " + name);
    }
}

class Dogs extends Animals {
    Dogs(String name) { 
    	super(name);//calling abstract class constructor
    }

    void sound() { 
    	System.out.println("Barks");
    }
}

public class DriverMain {
    public static void main(String[] args) {
        Dogs dog = new Dogs("Buddy");
        dog.display();
        dog.sound();
    }
}