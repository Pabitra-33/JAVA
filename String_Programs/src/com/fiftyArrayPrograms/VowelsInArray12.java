package com.fiftyArrayPrograms;

public class VowelsInArray12 {
	public static void main(String[] args) {
		// Declaring and initializing an array
		int[] elements = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };

		System.out.println("Vowels in the array: ");

		// Loop through each of the element in the array
		for (int i = 0; i < elements.length; i++) {

			// Check if the character is a vowel
			if (elements[i] == 'a' || elements[i] == 'e' || elements[i] == 'i' || elements[i] == 'o' || elements[i] == 'u'
					|| elements[i] == 'A' || elements[i] == 'E' || elements[i] == 'I' || elements[i] == 'O'
					|| elements[i] == 'U') {

				System.out.print((char)elements[i] + " ");
			}
		}
	}
}