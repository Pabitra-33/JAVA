package com.Encapsulation;

class Programmer {
	private String name;

	//Getter for name
	public String getName() {
		return name;
	}
	//Setter for name
	public void setName(String name) {
		this.name = name; 
	}
}

public class TestEncapsulation {
	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.setName("Jog Herry"); 
		System.out.println("Name=> " + p.getName());
 }
}
