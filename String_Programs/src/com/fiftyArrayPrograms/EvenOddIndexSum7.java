package com.fiftyArrayPrograms;

public class EvenOddIndexSum7 {
	//main method
	public static void main(String[] args) {
		// Declaring and initializing the array
		int[] numbers = { 1, 2, 3, 4, 5, 6 };

		
		int evenIndexSum = 0; // Initializing variables to store sum of evenIndexSum
		int oddIndexSum = 0; // Initializing variables to store sum of oddIndexSum

		// Looping through the array
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 == 0) {
				evenIndexSum += numbers[i]; // Adding elements at even index
			} else {
				oddIndexSum += numbers[i]; // Adding elements at odd index
			}
		}

		// Printing the results
		System.out.println("Sum of even index values: " + evenIndexSum);
		System.out.println("Sum of odd index values: " + oddIndexSum);
	}
}