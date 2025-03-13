package com.Abstraction;

//abstract class
abstract class Bike {
	abstract void run();
}

//subclass extending the abstract class
class Honda extends Bike {
	//providing implementation for the abstract class method by overriding it
	void run() {
		System.out.println("Running Safely");
	}
}
 
//driver class to implementation class
public class BikeDriver {
	public static void main(String args[]){  
		 Bike obj = new Honda();//upcasting  
		 obj.run();  
	}
}  