package com.abstraction;

//Abstract class
abstract class Animal {
	// Abstract method (no implementation)
    public abstract void makeSound();
 
    // Concrete method
    public void sleep() {
    	System.out.println("Zzz");
    }
}

//Concrete class
class Dog extends Animal {
	@Override
    public void makeSound() {
		System.out.println("Woof woof!");
	}
}

public class Main {
	public static void main(String[] args) {
		Animal myDog = new Dog();
        myDog.makeSound(); // Output: Woof woof!
        myDog.sleep();     // Output: Zzz
    }
}