package com.abstraction;

abstract class Bus {
	abstract void accelerate();
}

class Volvo extends Bus {
	@Override
	void accelerate() {
		System.out.println("Volvo::accelerate");
	}
}

class Benz extends Bus {
	@Override
	void accelerate() {
		System.out.println("Benz::accelerate");
	}
}
public class BusDriver {
	public static void main(String[] args) {
		Bus obj1 = new Volvo();//Up casting
		obj1.accelerate();
		
		Bus obj2 = new Benz();
		obj2.accelerate();
	}
}