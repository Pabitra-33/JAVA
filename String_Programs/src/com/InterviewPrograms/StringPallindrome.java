package com.InterviewPrograms;

import java.util.Scanner;

public class StringPallindrome {
	public static void main(String[] args) {
		// creating the scanner object
		Scanner sc = new Scanner(System.in);

		// taking the input
		String str = sc.next();
		
		boolean result = isPallindrome(str);

		if (result) {
			System.out.println(str + " is a Pallindromic String!");
		} else {
			System.out.println(str + " is not a Pallindromic String..!");
		}
		sc.close();
	}

	// Method to check palindrome
	public static boolean isPallindrome(String word) {
		// using the two pointer approach
		int left = 0;
		int right = word.length() - 1;

		// Compare characters from both ends
		while (left < right) {
			if (word.charAt(left) != word.charAt(right)) {
				return false; // Not a Palindrome
			}
			left++;
			right--;
		}
		return true; // Pallindrome
	}
}