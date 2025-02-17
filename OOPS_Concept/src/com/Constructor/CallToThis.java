package com.Constructor;

class Test
{
	Test(){
		this(10);//parameterized same class constructor calling statement
		System.out.println("Default Constructor");
	}
	Test(int i){
		System.out.println("Parameterized Constructor");
	}
}

public class CallToThis {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t);
	}
}
