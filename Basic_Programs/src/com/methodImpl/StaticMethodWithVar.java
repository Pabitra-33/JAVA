package com.methodImpl;

public class StaticMethodWithVar {
	//static variable
	int i;
	
	//creating a static method
	static void sDisplay() {
		//inside static method we can't call the non-static variables directly
		//i = 30;//CTE
	    //System.out.println("Static method = "+i);
	}
	
	//creating a non-static method
	void nDisplay() {
		//inside non-static method we can call the non-static variables directly
		i = 70;
		System.out.println("Non-static method = "+i);
	}
	
	//main method
	public static void main(String[] args) {
		System.out.println("Main Starts");
		StaticMethodWithVar n = new StaticMethodWithVar();
		sDisplay();//calling static method
		n.nDisplay();//calling non-static method
		System.out.println("Main Ends");
	}
}
