package com.polymorphism;

class Bike{    
	void run(){
		System.out.println("Bike running");
	}    
}    

class Splendor extends Bike{    
	void run(){
		System.out.println("Our Splendor running safely with 60km");
	}    
}  
	
public class BikeDriver{  
	public static void main(String args[]){    
	    Bike b = new Splendor();//upcasting    
	    b.run();    
	}    
}    