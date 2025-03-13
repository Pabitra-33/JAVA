package com.FactoryMethod;

public class BooKDriver {
	public static void main(String[] args) {
		Book b1 = Book.createBook();
		Book b2 = Book.createBook();
		Book b3 = Book.createBook();
		
		b1.display();
		System.out.println("------------");
		b2.display();
		System.out.println("------------");
		b3.display();
	}
}
