package com.Constructor;

public class Building {
	String bName;
	int bNo;
	
	//no-argument
	public Building() {
		System.out.println("Default Constructor");
	}

	//one argument/field
	public Building(String bName) {
		this();
		this.bName = bName;
		System.out.println("Parameterized Constructor: "+bName);
	}

	//two argument
	public Building(String bName, int bNo) {
		this(bName);
		this.bName = bName;
		this.bNo = bNo;
		System.out.println("Parameterized Constructor: "+bName+","+bNo);
	}
	
	//main method
	public static void main(String[] args) {
		Building b = new Building();
		Building b1 = new Building("Josh Palace", 201);
		System.out.println(b);
		System.out.println(b1);
	}
}
