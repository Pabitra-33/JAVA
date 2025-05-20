package com.classesAndobjects;

public class Car {
	// private data members
    private String brand;
    private String model;
    private int year;

    // Constructor to initialize the data members
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    //main method
    public static void main(String[] args) {
        // Creating an object of Car class
        Car myCar = new Car("Toyota", "Camry", 2022);
        
        // Calling method to display car details
        myCar.displayDetails();
    }
}