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
		A a1 = A.getInstance();
		A a2 = A.getInstance();
		A a3 = A.getInstance();
		
		System.out.println(a1);//com.FactoryMethod.A@24d46ca6
		System.out.println(a2);//com.FactoryMethod.A@24d46ca6
		System.out.println(a3);//com.FactoryMethod.A@24d46ca6
		
		a1.i -= 10; //60-10 = 50
		System.out.println(a1.i);//50
		System.out.println(a2.i);//50
	}
}
