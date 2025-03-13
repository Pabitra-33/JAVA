package com.Constructor;

public class D {
	//default D constructor
	public D() {
		System.out.println("Default D()-Constructor");
	}

	//parameterized D constructor
	public D(int i) {
		System.out.println("D(int i)-Constructor");
	}

	//parameterized D constructor with D class reference
	public D(D d) {
		System.out.println("D(D d)-Constructor");
	}

	//parameterized D constructor with A class reference
	public D(A a) {
		System.out.println("D(A a)-Constructor");
	}
	
	//main method
	public static void main(String[] args) {
		new D();
		new D(10);
		new D(new D());
		new D(new A());
	}
}
