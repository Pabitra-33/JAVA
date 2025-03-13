package com.blocks.MultiLineInitializer;

public class Test {
	//non-static block
	{
		System.out.println("Non-Static Block-1");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Starts");
		//for each new object created the non-static block will execute.
		Test t1 = new Test();
		System.out.println(t1);
		Test t2 = new Test();
		System.out.println(t2);
		System.out.println("Main Ends");
	}
	//non-Static block
	{
		System.out.println("Non-static Block-2");
	}
}
