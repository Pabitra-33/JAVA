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
		Vehicle v1 = getInstance();
		Vehicle v2 = getInstance();
		Vehicle v3 = getInstance();
		
		System.out.println(v1.name);
		System.out.println(v2.vNo);
		System.out.println(v3.name);
	}
}
