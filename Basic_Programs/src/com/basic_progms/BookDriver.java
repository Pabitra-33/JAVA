package com.basic_progms;

class Book
{
	String name;
	double price;//instance variables
}

public class BookDriver {
	public static void main(String[] args) {
		// object one
		Book b1 = new Book();
		b1.name = "Core Java";//assign values to instance var, by using the reference.
		b1.price = 700.00;
		
		// object two
		Book b2 = new Book();
		b2.name = "Learn C";
		b2.price = 650.00;
		
		//printing the values
		System.out.println(b1.name);
		System.out.println(b1.price);
		System.out.println("------------");
		System.out.println(b2.name);
		System.out.println(b2.price);
	}

}
