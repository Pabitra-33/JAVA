package com.wrapperclasses;

public class TestWrapperClass {
	public static void main(String[] args) {
		// Primitive data type
		int b;

		// Integer wrapper class
        Integer a;

		// assigning value to primitive 
		b = 357;

		// auto-boxing or auto wrapping
		// converting primitive int to Integer object
		a = b; 

		System.out.println("The primitive int b is: " + b);
		System.out.println("The Integer object a is: " + a);
	}
}
