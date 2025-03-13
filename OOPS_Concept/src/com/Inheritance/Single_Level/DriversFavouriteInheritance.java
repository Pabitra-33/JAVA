package com.Inheritance.Single_Level;

//Superclass
class Vehicle {
	protected String brand;
	protected int year;
	//constructor
	public Vehicle(String brand, int year) {
		this.brand = brand;
        this.year = year;
    }

	public void drive() {
		System.out.println("Driving the " + year + " " + brand);
    }
}

//Subclass
class Car extends Vehicle {
	private int numDoors;

    public Car(String brand, int year, int numDoors) {
       super(brand, year); // Call superclass constructor
       this.numDoors = numDoors;
    }

    public void honk() {
       System.out.println("Honking the horn of the " + getYear() + " " + getBrand());
    }

    public String getBrand() {
		return brand;
	}

	public int getYear() {
		return year;
	}

	public int getNumDoors() {
       return numDoors;
 }
}

public class DriversFavouriteInheritance {
 public static void main(String[] args) {
     Car myCar = new Car("Toyota", 2020, 4);
     
     // Accessing superclass method
     myCar.drive(); // Output: Driving the 2020 Toyota
     
     // Accessing subclass methods and inherited methods
     myCar.honk(); // Output: Honking the horn of the 2020 Toyota
     System.out.println("Number of doors: " + myCar.getNumDoors()); // Output: Number of doors: 4
 }
}
