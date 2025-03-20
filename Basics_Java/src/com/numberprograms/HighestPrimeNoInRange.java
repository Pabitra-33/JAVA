package com.numberprograms;

import java.util.Scanner;

public class HighestPrimeNoInRange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the starting range: ");
		int start = scanner.nextInt();
		System.out.println("Enter the ending range: ");
		int end = scanner.nextInt();
		
		//to calculate the highest prime in a given range,
		//we need to iterate a loop from the ending position
		for(int i=end; i>=start; i--) {
			if(isPrime(i)) {
				System.out.println(i);//after we get the highest prime number, break the loop.
				break;
			}
		}
		scanner.close();
	}
	
	//prime check method
	public static boolean isPrime(int num) {
		if(num <= 1) return false;
		
		for(int i=2; i<=num/2; i++) {
			if(num %i == 0)
				return false;
		}
		return true;
	}
}
