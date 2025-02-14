package com.Recursion;

import java.util.Scanner;

public class SumOfDigitsRec {

	public static void main(String[] args) {
		//try-with resource
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number:");
			int num = sc.nextInt();
			
			System.out.println("Sum of digits of "+num+" is: "+sum(num));
		}
	}
	
	public static int sum(int n) {
		if(n <= 9) return n;
		return (n%10)+sum(n/10);
	}
}
