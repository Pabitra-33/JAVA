package com.inheritance;
//parent or super or base class
class Parent {
	String pProperty = "House";
}

//child or sub or derived class
class Child extends Parent {
	String cProperty = "Bike";
}

public class SingleLevel {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.pProperty);
		System.out.println(ch.cProperty);
	}
}