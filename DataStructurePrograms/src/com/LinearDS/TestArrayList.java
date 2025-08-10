package com.LinearDS;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayListImplementation implementation = new ArrayListImplementation();
		
		//add elements
		implementation.add(10);
		implementation.add(20);
		implementation.add(30);
		implementation.add(50);
		implementation.add(60);
		implementation.add(70);
		
		//printing the size
		System.out.println("Size of the Arraylist is: "+implementation.size());
		
		System.out.println("Elements are: ");
		for(int i=0; i<implementation.size(); i++) {
			System.out.print((Integer) implementation.get(i)+" ");
		}
		
		implementation.remove(3);
		System.out.println();
		
		System.out.println("After reomval elements are: ");
		for(int i=0; i<implementation.size(); i++) {
			System.out.print((Integer) implementation.get(i)+" ");
		}
	}
}