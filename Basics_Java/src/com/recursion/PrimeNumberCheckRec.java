package com.recursion;

import java.util.Scanner;

public class PrimeNumberCheckRec {
	public static void main(String[] args) {
		System.out.println("Enter a number to check: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(isPrime(num, num/2)) 
			System.out.println("Prime Number");
		else 
			System.out.println("Not a Prime Number");
		
		sc.close();
	}
	
	public static boolean isPrime(int n, int i) {
		if(n <= 1 || n%i == 0)
			return false;
		if(i == 1) 
			return true;
		
		return isPrime(n, i-1);
	}
}
