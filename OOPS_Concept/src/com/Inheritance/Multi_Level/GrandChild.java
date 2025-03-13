package com.Inheritance.Multi_Level;

public class GrandChild extends Child {
	String carGarage = "JVM Parts and Care";
	
	public GrandChild(int car, String building) {
		super(car, building);//calling immediate parent class constructor
	}
}
