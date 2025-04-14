package com.abstraction;

//Declaring an interface
interface ShapeInter {
	void draw(); // Automatically public and abstract
}

//Class implementing the interface
class Circles implements ShapeInter {
	public void draw() { // Implementation of the interface method
		System.out.println("Drawing a circle.");
    }
}

//Testing the implementation
public class DriverShape {
	public static void main(String[] args) {
		ShapeInter shape = new Circles(); // Polymorphic reference
        shape.draw();
    }
}