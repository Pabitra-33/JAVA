package com.numberprograms;

import java.util.Scanner;

public class LastThreePrimeNoInRange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Starting value: ");
		int first = scanner.nextInt();
		System.out.println("Enter the Ending Value: ");
		int last = scanner.nextInt();
		
		int count = 0;//taking a count variable to count the number of prime we found.
		
		for(int i = last; i >= first; i--) {
			if(isPrime(i)) {
				count++;
				System.out.println(i);
				if(count == 3) break;//when we found three prime numbers then break the loop.
			}
		}
		scanner.close();
	}
	
	//prime number check method
	public static boolean isPrime(int n) {
		//if any number is less than 2, then it is not a prime number
		if(n <= 1) return false;
		
		for(int i= 2; i<= n/2; i++) {
			if(n%i == 0) 
				return false;
		}
		return true;
	}
}
