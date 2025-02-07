package com.Inheritance.Multi_Level;

class Child extends Parent{
	public Child(int car, String building) {
		super(car, building);
	}
	
	@Override
	public void getProperty() {
		System.out.println("Marry to Maria");
	}
}
