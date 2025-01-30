package com.blocks.MultiLineInitializer;

public class Test {
	//non-static block
	{
		System.out.println("Non-Static Block-1");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Test t1 = new Test();//for each new object created the non-static block will execute.
		Test t2 = new Test();
		System.out.println("Main Ends");
	}
	//non-Static block
	{
		System.out.println("Non-static Block-2");
	}
}
