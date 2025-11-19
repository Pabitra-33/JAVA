package com.fiftyArrayPrograms;

public class LastIndexValue15 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 9, 3, 9, 4, 9, 6, 7, 8 };
		int target = 9;

		int lastIndex = -1; // default (if element not found in the array)

		// Loop through the array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				lastIndex = i; // update every time a match is found
			}
		}

		System.out.println("Last index of " + target + " is: " + lastIndex);
	}
}