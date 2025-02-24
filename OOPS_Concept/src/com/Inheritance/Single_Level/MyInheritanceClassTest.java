package com.Inheritance.Single_Level;

// parent/ super class
class Wood {
	String name = "Tree Wood";
	public void display() {
		System.out.println("Wood Class display method: "+name);
	}
}

// child/ sub-class
class Bed extends Wood {
	String bedName = "King Size";
	@Override
	public void display() {
		System.out.println("Bed class display method: "+bedName);
	}
}
public class MyInheritanceClassTest {
	public static void main(String[] args) {
		Wood w = new Wood();
		w.display();
		
		Bed b = new Bed();
		b.display();
	}
}
