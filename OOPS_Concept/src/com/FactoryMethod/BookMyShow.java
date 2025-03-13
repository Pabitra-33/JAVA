package com.FactoryMethod;

public class BookMyShow {
	public static void main(String[] args) {
		
		//as the constructor is private so we can't create any instance outside the class
		//BookMovieHall b = new BookMovieHall();//CTE
		
		BookMovieHall user1 = BookMovieHall.getInstance();
		user1.bookTicket(15);//first user booked 15tickets
		
		BookMovieHall user2 = BookMovieHall.getInstance();
		user2.bookTicket(15);
		
		BookMovieHall user3 = BookMovieHall.getInstance();
		user3.bookTicket(25);//when we want to book tickets more than available, it won't book
	}
}