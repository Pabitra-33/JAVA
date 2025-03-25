package com.recursion;

import java.util.Scanner;

public class DigitsSumRec {
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a number:");
 		int n = sc.nextInt();
 		
 		System.out.println("Sum of digits of "+n+" is: "+sum(n));
 		sc.close();
 	}
 	
 	public static int sum(int num) {
 		if(num <= 9) return num;
 		return (num % 10) + sum(num / 10);
 	}
}
