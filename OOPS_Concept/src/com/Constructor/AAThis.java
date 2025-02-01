package com.Constructor;

public class AAThis {

	public AAThis() {
		System.out.println("Default Constructor");
	}

	public AAThis(int i) {
		this();
		System.out.println("Parameterized Constructor "+i);
	}

	public AAThis(int i, int j) {
		this(i);
		System.out.println("Argumented Constructor "+i+","+j);
	}
	
	//main method
	public static void main(String[] args) {
		//creating instance of AAThis
		AAThis a = new AAThis(10,20);
	}
	
}
