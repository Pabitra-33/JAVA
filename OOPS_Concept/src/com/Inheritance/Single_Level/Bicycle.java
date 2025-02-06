package com.Inheritance.Single_Level;

public class Bicycle {
	public int gear;
	public int speed;
	
	//bicycle constructor
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	//display method
	public void display() {
		System.out.println("Gear :"+gear+"Speed: "+speed);
	}
}
class MountainBicycle extends Bicycle {
	//MountainBicycle constructor
	public MountainBicycle(int gear, int speed) {
		super(gear, speed);
	}
}
