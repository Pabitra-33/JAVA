package com.blocks.singleLineInitializer;

public class SingleLine {
//	static int i;
//	i=10; //we can't declare like this we have to declare and initialize in the same line
	
	static int i = 10;
	int j = 30;
	
	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println("Accessing the static variable i:"+SingleLine.i);
		System.out.print("Accessing the non-static variabje j:");
		SingleLine s = new SingleLine();
		System.out.print(s.j);
		System.out.println("Main Ends");
	}
}