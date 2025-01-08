package com.Recursion;

import java.util.Scanner;

public class SumOfDigitsRec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		
		System.out.println("Sum of digits of "+n+" is: "+sum(n));
	}
	
	public static int sum(int no) {
		if(no <= 9) return no;
		return (no%10)+sum(no/10);
	}
}
