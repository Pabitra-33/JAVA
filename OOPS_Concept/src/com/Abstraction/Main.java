package com.Abstraction;

//Demonstrating Abstraction
abstract class Light {
	abstract void turnOn();
    abstract void turnOff();
}

//Concrete class implementing the abstract methods
class TVRemote extends Light {
	@Override
    void turnOn() {
		System.out.println("TV is turned ON.");
	}

	@Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

//Main class to demonstrate abstraction
public class Main {
	public static void main(String[] args) {
		Light remote = new TVRemote();//created object for the child and store in parent class
		remote.turnOn();  
        remote.turnOff();
    }
}