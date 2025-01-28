package com.ClassObject;

public class Book {
	String name;
	String author;
	double price;
	
	//initialization method
	public void initialize(String n, String a, double p) {
		name = n;
		author = a;
		price = p;
	}
	
	//display method
	public void display() {
		System.out.println(name+"\n"+author+"\n"+price);
	}
}
