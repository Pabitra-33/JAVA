package com.FactoryMethod;

import java.util.Scanner;

public class Book {
	String name;
	String author;
	double price;
	
	//argumented constructor
	public Book(String name, String author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	//factory method
	public static Book createBook() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter book name:");
		String name = scn.next();
		
		System.out.println("Enter book author:");
		String author = scn.next();
		
		System.out.println("Enter book price:");
		double price = scn.nextDouble();
		
		return new Book(name, author, price);
	}
	
	//display method
	public void display() {
		System.out.println(name+"\n"+author+"\n"+price);
	}
}
