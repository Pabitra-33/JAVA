package com.Constructor;

public class NoOfObjects {
	static int count = 0;//to calculate no of objects
	
	//constructor
	public NoOfObjects() {
		count++;
	}

	public static void main(String[] args) {
		new NoOfObjects(); //abandon objects
		new NoOfObjects();
		new NoOfObjects();
		
		System.out.println("No of objects created: "+ NoOfObjects.count);
	}

}
