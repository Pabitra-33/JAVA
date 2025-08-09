package com.abstraction;

//Abstract class
abstract class Vehicles {
	abstract void start(); // Abstract method (no body)

	void fuel() { // Non-abstract method (has body)
		System.out.println("Filling fuel.");
    }
}

//Subclass
class Cars extends Vehicles {
	void start() { // Implementing abstract method
		System.out.println("Car is starting.");
    }
}

//implementation class
public class DataAbstractionVehicle {
	public static void main(String[] args) {
	     Cars myCar = new Cars();
	     myCar.start();
	     myCar.fuel();
	 }
}