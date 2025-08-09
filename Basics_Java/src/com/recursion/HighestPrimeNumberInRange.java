package com.recursion;

import java.util.Scanner;

public class HighestPrimeNumberInRange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first range: ");
		int start = scanner.nextInt();
		System.out.println("Enter the last range: ");
		int end = scanner.nextInt();
		
		for (int i = end; i >= start; i--) {
			if(isPrime(i, i/2)) {
				System.out.println(i);
				break;
			}
		}
		scanner.close();
	}
	
	//prime check method
		public static boolean isPrime(int n, int div) {
			if(div == 1) 
				return true;
			if(n <= 1 || n%div == 0)
				return false;
			return isPrime(n, div-1);
		}
}
