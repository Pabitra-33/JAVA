package com.fiftyArrayPrograms;

public class SumOfArrayElements6 {
	public static void main(String[] args) {
		// Declaring and initializing the array
		int[] numbers = { 1, 2, 3, 4, 5, 6 };

		// Initializing a variable to store the sum
		int sum = 0;

		// Looping through the array to calculate the sum
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i]; // add each element to sum
		}

		// Printing the sum
		System.out.println("Sum of all elements in the array: " + sum);
	}
}