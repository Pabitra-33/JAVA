package com.methodImpl;

public class Non_StaticMethodWithVar 
{
	//static variable
	static int i;
	
	//creating a static method
	static void display() {
		//inside static method we can call the static variables directly
		i = 30;
		System.out.println("Static method = "+i);
	}
	//creating a non-static method
	void nDisplay() {
		//inside non-static method we can call the static variables directly
		i = 70;
		System.out.println("Non-static method = "+i);
	}
	
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Non_StaticMethodWithVar n = new Non_StaticMethodWithVar();
		display();//calling static method
		n.nDisplay();//calling non-static method
		System.out.println("Main Ends");
	}
}
