package com.methodimplementations;

public class StaticMethodWithVar {
	//non-static variable
	int i;
	
	//creating a static method
	static void sDisplay() {
		//inside the static method we can not directly call the non-static variables
		//i = 30;//CTE
		//System.out.println("Static Method: "+i);//can not access i
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
		n.nDisplay();//calling the non-static method
		System.out.println("Main Ends");
	}
}