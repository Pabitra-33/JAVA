package com.fiftyArrayPrograms;

public class PrimeNumbersInArray11 {
	// Method to check if a number is prime
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false; // 1 and negative numbers are not prime
		}
		
		// Check divisibility from 2 to num/2
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				return false; // Not a prime number
			}
		}
		return true; // Prime number
	}
	
	public static void main(String[] args) {
		//Declaring and initializing an array
		int[] numbers = {1, 2, 3, 4, 5, 6};
		
		System.out.println("Prime numbers in the array: ");
		
		// Loop through each element
		for(int i = 0; i < numbers.length; i++) {
			// Check if the element is prime
			if(isPrime(numbers[i])) {
				System.out.print(numbers[i]+" ");
			}
		}
	}
}