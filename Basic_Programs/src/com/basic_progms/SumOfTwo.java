package com.basic_progms;

import java.util.Scanner;

public class SumOfTwo {
	public static void main(String[] args) {
		//surrounding with try-with resource for implicit close of connections
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first number: ");
			int first = sc.nextInt();
			System.out.println("Enter second number: ");
			int second = sc.nextInt();
			
			int sum = 0;//to calculate sum of two no and store it in a variable.
			sum = first + second;
			System.out.println("Sum of two numbers "+first+" and "+second+" is = "+sum);
		}
	}

}
