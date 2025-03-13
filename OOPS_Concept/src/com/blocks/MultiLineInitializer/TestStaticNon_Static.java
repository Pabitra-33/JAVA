package com.blocks.MultiLineInitializer;

public class TestStaticNon_Static 
{
	//static block-1
	static {
		System.out.println("Static block-1");
		TestStaticNon_Static t = new TestStaticNon_Static();
		System.out.println(t);
	}
	
	//non-static block-1
	{
		System.out.println("Non-static block-1");
	}
	
	//main method
	public static void main(String[] args) {
		System.out.println("Main Starts");
		TestStaticNon_Static t1 = new TestStaticNon_Static();
		System.out.println(t1);
		System.out.println("Main Ends");
	}
	
	//non-static block-2
	{
		System.out.println("Non-Static block-2");
	}
	
	//static block-2
	static {
		System.out.println("Static block-2");
	}
	
	//static block-1
	static {
		System.out.println("Static block-3");
	}
}
