package com.Polymorphism;

//base class person
class Person {
	void role() {
		System.out.println("I am a Person...");
	}
}

//Derived class Father that overrides the role method.
class Father extends Person 
{
	@Override
	void role() {
		System.out.println("I am a Father..!");
	}
}

public class TestPolymorphism {
	public static void main(String[] args) {
		Person p = new Father();
		p.role();//it will call the overridden father method
	}
}
