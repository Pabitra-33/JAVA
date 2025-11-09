package com.fiftyArrayPrograms;

public class ReverseCharArray {
	public static void main(String[] args) {
		//Declaring and initializing a character array
		char[] letters = {'j','a','v','a',' ','i','s',' ','f','u','n'};
		
		//printing the original characters
		System.out.println("Original characters: ");
		for (char c : letters) {
			System.out.print(c);
		}
		
		System.out.println("\nCharacters in reverse order: ");
		//Printing characters in reverse order
		for(int i = letters.length-1; i>=0; i--) {
			System.out.print(letters[i]);
		}
	}
}