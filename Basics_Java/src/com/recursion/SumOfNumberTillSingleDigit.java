package com.recursion;

import java.util.Scanner;

public class SumOfNumberTillSingleDigit {
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a number: ");
 		int n = sc.nextInt();
 		System.out.println("Single digit sum is :"+sumOfDigits(n));
 		sc.close();
 	}
 	
 	public static int sumOfDigits(int n) {
 		if(n == 0) return 0;
 		
 		int sumNo = n%10 + sumOfDigits(n/10);
 		//check for single digit
 		if(sumNo > 9) {
 			//System.out.println("Sum of digits :"+sumNo);
 			return sumOfDigits(sumNo);
 		}
 		return sumNo;
 	}
}
