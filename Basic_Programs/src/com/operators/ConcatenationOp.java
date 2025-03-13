package com.operators;

public class ConcatenationOp {

	public static void main(String[] args) {
		//concatenation in java is done by '+' operator.
		//it basically merge two strings type to one string.
		//concatenation operator can't use for boolean values.
		
		//when there is any one value is string then only it performs concatenation, else normal addition operation happens.
		System.out.println("ab"+"cd");//abcd
		System.out.println("a"+10);//a10
		System.out.println("10"+"20");//1020
		
		//In character type it takes the ascii value and add it.
		System.out.println(1+'A');//66
		System.out.println("1"+2+3);//123
		System.out.println("1"+(2+3));//15
		
		int a = 10;
		int b = 20;
		System.out.println("a = "+a+" \t"+"b = "+b);// a=10  b=20
		System.out.println(a+" + "+b+" = "+(a+b));
	}

}
