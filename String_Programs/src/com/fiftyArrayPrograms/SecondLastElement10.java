package com.fiftyArrayPrograms;

public class SecondLastElement10 {
	public static void main(String[] args) {
		// Declare and initialize the array
		int[] numbers = { 1, 2, 3, 4, 5, 6 };

		// Second last element is at index length - 2
		int secondLast = numbers[numbers.length - 2];

		// Print the second last element
		System.out.println("Second last element: " + secondLast);
	}
}