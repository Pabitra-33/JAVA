package com.abstraction;

abstract class CarVehicle{  
	abstract void run();  
}  

class Hyundai extends CarVehicle{  
	@Override
	void run() {
		System.out.println("Hyundai manufactures cars");
	}  
}
	
public class CarDriver {
	public static void main(String args[]){  
		CarVehicle obj = new Hyundai();  
		obj.run();
	}
}