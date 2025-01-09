package com.Recursion;

import java.util.Scanner;

public class PrimeNumberCheckRec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(isPrime(num, num/2)) {
			System.out.println(num+" is a Prime Number");
		}
		else {
			System.out.println(num+" is not a Prime Number");
		}
	}
	
	public static boolean isPrime(int n, int i) {
		if(i==1) return true;
		if(n<=1 || n%i == 0) return false;
		return isPrime(n, i-1);
	}
}
