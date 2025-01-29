package com.blocks.MultiLineInitializer;

public class StaticBlock1 {
	
	//static blocks are always executed before main method
	static {
		System.out.println("Static block executed");
	}
	
	//main method
	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println("Main Ends");
	}

}
