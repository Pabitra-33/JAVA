package com.methodImpl;

public class Main {
	public static void main(String[] args) {
		System.out.println("About to call a method.");
		myMethod();//method call
		System.out.println("Method was executed successfully!");
	}
	
	private static void myMethod() { //method defination
		System.out.println("Printing from inside myMethod()!.");
	}
}
