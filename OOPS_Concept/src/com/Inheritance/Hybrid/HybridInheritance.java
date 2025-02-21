package com.Inheritance.Hybrid;

//Grandfather Class
class GrandFather {
	public void printGrandFather() {
		System.out.println("GrandFather's class");
	}
}

//Father Class extends Grandfather
class Father extends GrandFather {
	public void printFather() {
		System.out.println("Father class has inherited GrandFather class");
	}
}

//Son class extends Father Class
class Son extends Father {
	public Son() {
		System.out.println("Inside the Son Class Constructor");
	}
	public void printSon() {
		System.out.println("Son class has inherited Father class");
	}
}
//Daughter class inherits Father Class
class Daughter extends Father {
	public Daughter() {
		System.out.println("Inside the Daughter Class Constructor");
	}
	public void printDaughter() {
		System.out.println("Son class has inherited Father class");
	}
}
 
//Implementation Class
public class HybridInheritance {
	public static void main(String[]args) {
		Son obj = new Son();
		obj.printSon();  // Accessing Son class method
		obj.printFather();  // Accessing Father class method
		obj.printGrandFather();  // Accessing GrandFather class method
 
		Daughter obj2 = new Daughter();
		obj2.printDaughter();  // Accessing Daughter class method
		obj2.printFather();    // Accessing Father class method
		obj2.printGrandFather();   // Accessing GrandFather class method
	}
}
