package com.fiftyArrayPrograms;

public class ConsonantsInArray12I {
	public static void main(String[] args) {

		// Declaring and initializing the array
		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };

		System.out.println("Consonants in the array:");

		// Loop through array to check consonants
		for (int i = 0; i < letters.length; i++) {
			char ch = letters[i];//taking the first letter

			// Check the first letter is a alphabet or not
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

				// Check if NOT a vowel → means consonant
				if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o'
					&& ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I'
					&& ch != 'O' && ch != 'U') {

					System.out.print(ch + " ");
				}
			}
		}
	}
}