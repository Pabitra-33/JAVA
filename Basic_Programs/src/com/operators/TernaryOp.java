package com.operators;

import java.util.Scanner;

//write a program to take input two numbers from user, and print the maximum number between two number using ternary operator.
public class TernaryOp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int x = sc.nextInt();//first number
		System.out.println("Enter second number: ");
		int y = sc.nextInt();//second number
		int max;//to store the maximum
		
		max = x > y ? x : y;//ternary operator used to calculate the big
		System.out.println("Maximum number between "+x+" and "+y+" is: "+max);
		sc.close();//closed the scanner reference
	}

}
