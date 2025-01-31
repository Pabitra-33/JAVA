package com.Constructor;

public class Mobile {
	String name;
	String color;
	int ram;
	int rom;
	
	//constructor using one field name
	public Mobile(String name) {
		this.name = name;
	}
	//constructor using two field name
	public Mobile(String name, String color) {
		this.name = name;
		this.color = color;
	}
	//constructor using three field name
	public Mobile(String name, String color, int ram) {
		this.name = name;
		this.color = color;
		this.ram = ram;
	}
	//constructor using all fields
	public Mobile(String name, String color, int ram, int rom) {
		this.name = name;
		this.color = color;
		this.ram = ram;
		this.rom = rom;
	}
	
	//display method
	public void display() {
		System.out.println(name+"\n"+color+"\n"+ram+"\n"+rom);
	}
	
	//main method
	public static void main(String[] args) {
		//Mobile m = new Mobile();//CTE - bcz there is no default constructor is present
		Mobile m1 = new Mobile("OPPO");
		Mobile m2 = new Mobile("MI A2", "Black");
		Mobile m3 = new Mobile("Samsung", "White", 6);
		Mobile m4 = new Mobile("Motorola","Violet",4,128);
		
		//calling display method
		m1.display();
		m2.display();
		m3.display();
		m4.display();
	}
}
