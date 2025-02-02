package com.FactoryMethod;

public class Test {
	
	//factory method(used to create instance of that class and return it).
	public static Test m1() {
		Test t = new Test();
		return t;
	}
	
	//main method
	public static void main(String[] args) {
		Test t1 = m1();
		Test t2 = m1();
		
	}
}
