package com.fiftyArrayPrograms;

public class EvenElementsSum8 {
	//main method
	public static void main(String[] args) {
		// Declaring and initializing the array
		int[] numbers = { 1, 2, 3, 4, 5, 6 };

		// Initializing a variable to store the sum of even elements
		int evenSum = 0;

		// Looping through each element of the array 
		for (int i = 0; i < numbers.length; i++) {
			// Checking if the element is even
			if (numbers[i] % 2 == 0) {
				evenSum += numbers[i]; // Add even element to sum
			}
		}

		// Printing the result
		System.out.println("Sum of even elements in the array: " + evenSum);
	}
}