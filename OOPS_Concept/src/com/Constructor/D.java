package com.Constructor;

public class D {

	public D() {
		System.out.println("Default D()-Constructor");
	}

	public D(int i) {
		System.out.println("D(int i)-Constructor");
	}

	public D(D d) {
		System.out.println("D(D d)-Constructor");
	}

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
