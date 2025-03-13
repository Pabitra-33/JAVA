package com.FactoryMethod;

//creating a SingleTon Class
public class BookMovieHall {
	private int seats = 50;
	private static BookMovieHall bookmoviehall = null;
	
	//creating a private constructor
	private BookMovieHall() {
		
	}
	
	//bookTicket method
	public void bookTicket(int n) {
		if(n <= seats) {
			seats -= n;
			System.out.println(n+" seats are Booked.");
		}else {
			System.out.println(n+" Tickets are not Booked!");
		}
		System.out.println(seats+" seats are Available.");
	}
	
	//factory method to create only one instance
	public static BookMovieHall getInstance() {
		if(bookmoviehall == null) {
			bookmoviehall = new BookMovieHall();
			return bookmoviehall;
		}else {
			return bookmoviehall;
		}
	}
}
