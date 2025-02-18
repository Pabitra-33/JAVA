package com.Inheritance.Single_Level;

//Parent class
class Animal {
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

//Child class inheriting from Animal
class Dog extends Animal {
	void bark() {
		System.out.println("Dog barks");
	}
}

public class ImplementSingleLevel {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.makeSound();
	}
}
