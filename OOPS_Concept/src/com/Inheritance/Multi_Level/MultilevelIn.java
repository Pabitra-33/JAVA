package com.Inheritance.Multi_Level;

class One{
	//method
	public void one() {
		System.out.println("Parent Class one method");
	}
}

class Two extends One{
	//method
	public void two() {
		System.out.println("Child Class two method");
	}
}

class Three extends Two{
	//method
	public void three() {
		System.out.println("Grand-child Class three method");
	}
}

public class MultilevelIn {
	public static void main(String[] args) {
		Three th = new Three();
		
		//calling one class method
		th.one();
		//calling two class method
		th.two();
		//calling three class method
		th.three();
	}
}
