package com.Inheritance.Single_Level;

class A {
	int i = 20;
}

class B extends A{
	int i = 30;
	
	public void display() {
		System.out.println("Child class member i :"+i);
		System.out.println("Parent Class member i:"+super.i);//referring parent class data member
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		B b = new B();
		b.display();
	}
}
