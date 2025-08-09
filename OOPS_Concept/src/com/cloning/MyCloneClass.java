package com.cloning;

//object cloning in java
public class MyCloneClass implements Cloneable {
	String name;
	int id;
	
	//parameterized constructor
	public MyCloneClass(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	//show method, making an instance to display name and id
	public void display() {
		System.out.println("Id: "+id);
        System.out.println("Name: "+name);
	}
	
	//main method
	public static void main(String[] args) throws CloneNotSupportedException {
		
		//creating an object of class
		MyCloneClass obj1 = new MyCloneClass("Srishti", 103);
		obj1.display();
		
		//Making clone of obj1 by invoking a method clone
	    //by creating new reference
	    MyCloneClass obj2 = (MyCloneClass) obj1.clone();
	    obj2.display(); //Same values are printed as with obj1
	}
}