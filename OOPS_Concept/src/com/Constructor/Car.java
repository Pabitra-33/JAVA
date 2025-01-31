package com.Constructor;

/* Implemented Constructor Overloading Here */
public class Car {
	String name;
	String color;
	int carNo;
	double price;
	
	//default constructor
	public Car() 
	{
		
	}
	//parameterized constructor
	public Car(String name, String color, int carNo, double price) {
		this.name = name;
		this.color = color;
		this.carNo = carNo;
		this.price = price;
	}
	
	//display method
	public void display() {
		System.out.println(name+"\n"+color+"\n"+carNo+"\n"+price);
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();//will call default constructor
		Car c2 = new Car("BMW", "Black", 3002, 20000000);//call the parameterized constructor
		
		c1.display();
		System.out.println("--------------");
		c2.display();
	}
}
