package com.overloadingAndoverriding;

//parent class
class Fruit {
	//parent class method
	public void taste() {
		System.out.println("I am tasty...!");
	}
}
//child class
class Orange extends Fruit {
	@Override
	public void taste() {//method hiding
		System.out.println("My taste is very good");
	}
	
	//new specific method of child class
	public void vitamin() {
		System.out.println("I am rich in Vitamin-D");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		//creating object of child class
		Orange o = new Orange();
		o.taste();
		o.vitamin();
	}
}
