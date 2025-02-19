package com.methodImpl;

import java.util.Scanner;

public class SquareMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate the square: ");
		int n = sc.nextInt();
		int result;
		result = square(n);//calling square method and storing the result in a variable
		System.out.println("Squared value of "+n+" is: "+result);
		sc.close();//closing the scanner connection
	}
	
	//square method
	public static int square(int num) {
		return num * num; //return statement
	}
}
