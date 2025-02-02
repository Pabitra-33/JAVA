package com.FactoryMethod;

public class Vehicle {
	String name;
	int vNo;
	
	//constructor
	public Vehicle(String name, int vNo) {
		this.name = name;
		this.vNo = vNo;
	}
	
	//factory method
	public static Vehicle getInstance() {
		Vehicle v = new Vehicle("Truck", 1003);
		return v;
	}
	
	//main method
	public static void main(String[] args) {
		
	}
}
