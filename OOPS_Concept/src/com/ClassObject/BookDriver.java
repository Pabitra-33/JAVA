package com.ClassObject;

public class BookDriver {
	public static void main(String[] args) {
		//creating instances of book class
		Book b1 = new Book();
		//initializing data to book1
		b1.initialize("Ramayan", "Valmiki", 9000);
		b1.display();
		System.out.println("===========");
		
		Book b2 = new Book();
		//initializing data to book2
		b2.initialize("Mahabharat", "Veda Vyasa", 7000);
		b2.display();
		System.out.println("============");
		
		Book b3 = new Book();
		//initializing data to book3
		b3.initialize("Bhagavad gita", "Maharishi Veda Vyasa", 10000);
		b3.display();
	}
}
