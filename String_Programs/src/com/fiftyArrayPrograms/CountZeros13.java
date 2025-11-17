package com.fiftyArrayPrograms;

public class CountZeros13 {
	public static void main(String[] args) {
		// Declaring and initializing the array
		int[] numbers = { 1, 0, 3, 0, 5, 6, 0 };

		// Variable to count zeros
		int zeroCount = 0;

		// Looping through the array
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				zeroCount++; // increase count whenever element is zero
			}
		}

		// Printing the number of zeros
		System.out.println("Number of zeros in the array: " + zeroCount);
	}
}