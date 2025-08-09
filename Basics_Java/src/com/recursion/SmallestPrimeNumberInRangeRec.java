package com.recursion;

import java.util.Scanner;

public class SmallestPrimeNumberInRangeRec {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first range: ");
		int start = scanner.nextInt();
		System.out.println("Enter the last range: ");
		int end = scanner.nextInt();
		
		for (int i = start; i <= end; i++) {
			if(isPrime(i, i/2)) {
				System.out.println(i);
				break;
			}
		}
		scanner.close();
	}
	
	//prime number check
	public static boolean isPrime(int n, int i) {
		if(i == 1) return true;
		if(n <= 1 || n%i == 0) return false;
		return isPrime(n, i-1);
	}
}
