package com.operators;

public class ArithmaticOp {
	public static void main(String[] args) {
		int x = 12;
		int y = 10; //local variables
		
		//Arithmetic operators
		int addition = x + y;
		int substraction = x - y;
		int multiplication = x * y;
		int division = x / y;
		int modulus = x % y;
		
		//printing the values
		System.out.println("Addition of "+x+" and "+y+" = "+addition);
		System.out.println("Substraction of "+x+" and "+y+" = "+substraction);
		System.out.println("Multiplication of "+x+" and "+y+" = "+multiplication);
		System.out.println("Division of "+x+" and "+y+" = "+division);
		System.out.println("Modulus of "+x+" and "+y+" = "+modulus);
	}

}
