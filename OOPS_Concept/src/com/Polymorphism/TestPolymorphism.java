package com.Polymorphism;

//base class person
class Person {
	void role() {
		System.out.println("I am a Person...");
	}
}

//child class
class Father extends Person {
	@Override
	void role() {
		System.out.println("I am a Father..!");
	}
}
public class TestPolymorphism {

}
