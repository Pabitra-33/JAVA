package com.blocks.singleLineInitializer;

public class SingleInitialize {
	String name = "Jogesh";
	int age = 10;
	String classs = "IV";
	int rank = 3;
	
	public static void main(String[] args) {
		System.out.println("Main Starts");
		
		//creating object of SingleInitialize class
		SingleInitialize s = new SingleInitialize();
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.classs);
		System.out.println(s.rank);
		System.out.println("Main Ends");
	}
}
