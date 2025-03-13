package com.Inheritance.Single_Level;

//Super-class or parent class
class ParentAnimal {
	//field and method of parent class
	String name;
	public void eat() {
		System.out.println("I can Eat anything...");
	}
}

//Sub-class or child class(Inherited from Parent class)
class ChildAnimal extends ParentAnimal {
	//new method of sub_class
	public void display() {
		System.out.println("My name is: " +name);
	}
}
//test or implementation class
public class TestAnimalInheritance {
	//main method
	public static void main(String[] args) {
		//creating object of sub-class
		ChildAnimal labrador = new ChildAnimal();
		
		//accessing filed & methods of superClass
		labrador.name = "DoggyDon";
		labrador.display();
		labrador.eat();
	}
}
