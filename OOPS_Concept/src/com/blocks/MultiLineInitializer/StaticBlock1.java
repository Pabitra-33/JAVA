package com.blocks.MultiLineInitializer;

public class StaticBlock1 {
	
	//static blocks are always executed before main method.
	//first static block
	static {
		System.out.println("1st Static block executed");
	}
	
	//main method
	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println("Main Ends");
	}
	
	//second static block
	static {
		System.out.println("2nd Static block executed");
	}
	
	//third static block
	static {
		System.out.println("3rd Static block executed");
	}
}
