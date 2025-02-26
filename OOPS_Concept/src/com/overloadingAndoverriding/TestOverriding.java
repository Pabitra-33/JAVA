package com.overloadingAndoverriding;

//Base class
class Animal {
	 void move() { 
		 System.out.println("Animal is moving.");
	 }
	 void eat() { 
		 System.out.println("Animal is eating.");
	 }
}


class Dog extends Animal {
	@Override 
    void move() // move() method from Base class is overridden
	{ 
		System.out.println("Dog is running.");
	}
	void bark() { 
		System.out.println("Dog is barking."); 
	}
}

public class TestOverriding {
	public static void main(String[] args) {
     Dog d = new Dog();
     d.move(); // Output: Dog is running.
     d.eat(); // Output: Animal is eating.
     d.bark(); // Output: Dog is barking.
     }
}
