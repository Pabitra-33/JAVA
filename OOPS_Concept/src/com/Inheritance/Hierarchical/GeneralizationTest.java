package com.Inheritance.Hierarchical;

//Generalized Superclass
class Vehicle {
	int speed;
	String color;
	//start method
	void start() {
		System.out.println("Vehicle is starting");
	}
	//stop method
    void stop() {
       System.out.println("Vehicle is stopping");
    }
}

//Subclasses
class Car extends Vehicle {
	//car specific method
	void openSunroof() {
		System.out.println("Sunroof is open");
	}
}

class Bike extends Vehicle {
	//bike specific method
	void wheelie() {
		System.out.println("Bike is doing a wheelie");
	}
}

public class GeneralizationTest {
	public static void main(String[] args) {
		Car myCar = new Car();//object for Car Class
        myCar.start(); // Output: Vehicle is starting
        myCar.openSunroof();

        Bike myBike = new Bike();//object for Bike Class
        myBike.start(); // Output: Vehicle is starting
        myBike.wheelie();
    }
}
