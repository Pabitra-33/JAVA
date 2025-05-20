package com.polymorphism;

//Method overloading By using, Different Types of Arguments
//Class 1 Helper class
class Helper {
	// Method with 2 integer parameters
    static int Multiply(int a, int b){
        return a * b;// Returns product of integer numbers
    }

    // Method 2 With same name but with 2 double parameters
    static double Multiply(double a, double b) {
        return a * b;// Returns product of double numbers
    }
}

public class HelperOverloading {
	//Main driver method
	public static void main(String[] args) {
		// Calling method by passing
	    // input as in arguments
	    System.out.println(Helper.Multiply(2, 4));
	    System.out.println(Helper.Multiply(5.5, 6.3));
	 }
}