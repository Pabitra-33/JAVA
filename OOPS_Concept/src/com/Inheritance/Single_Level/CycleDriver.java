package com.Inheritance.Single_Level;

public class CycleDriver {
	public static void main(String[] args) {
		Bicycle b = new Bicycle(5, 30);
		Bicycle b1 = new Bicycle(6, 50);
		b.speed = 40;
		b.display();
		b1.display();
	}
}
