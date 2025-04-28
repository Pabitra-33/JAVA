package com.classesAndobjects;

public class Student {
 	static String insti;//for all institute is same so make it static
 	String name;
 	int age;
 	int id;
 	long mobile;
 	
 	//display method
 	public void display() {
 		System.out.println(insti);
 		System.out.println(name);
 		System.out.println(age);
 		System.out.println(id);
 		System.out.println(mobile);
 	}
}