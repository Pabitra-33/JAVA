package com.Inheritance.Multiple;

class Parent1{
	static int i = 10;
	public static void display() {
		System.out.println("Parent1 display "+i);
	}
}

class Parent2{
	float k = 2.5f;
	public void message() {
		System.out.println("Parent2 message  method:"+k);
	}
}

class Child extends Parent1{
	int f = 10;
}
public class ParentChildMultiple {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println("The value of the f variable: "+ch.f);
		System.out.println("The value of the i variable: "+Parent1.i);
	}
}
