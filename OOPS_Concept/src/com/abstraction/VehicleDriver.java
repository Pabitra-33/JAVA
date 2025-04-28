package com.abstraction;

//Interface
interface Vehicle {
	void start();  // Abstract method
    void stop();   // Abstract method
}

//Implementing class
class Car implements Vehicle {
	@Override
    public void start() {
		System.out.println("Car started");
    }
 
    @Override
    public void stop() {
       System.out.println("Car stopped");
    }
}

public class VehicleDriver {
	public static void main(String[] args) {
		Vehicle myCar = new Car();
        myCar.start();  // Output: Car started
        myCar.stop();   // Output: Car stopped
 }
}