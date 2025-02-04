package com.FactoryMethod;

class A
{
	static A a = null;
	int i = 60;
	
	//we can make a singleton class by making our constructor private
	private A() {
		
	}
	
	//to create a object for private constructor we used factory method
	public static A getInstance() {
		//checking if the class has any object or not, if this is null then create one
		if(a == null) {
			a = new A();
			return a;
		}else {
			return a;
		}
	}
}

public class SingleTonClass {
	public static void main(String[] args) {
		
	}
}
