package com.impStringprogms;

import java.util.Scanner;

public class PallindromeString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = scanner.nextLine();
		
		if(isPallindrome(s)) {
			System.out.println("Pallindrome String!!");
		}
		else {
			System.out.println("Not a Pallindrome String...");
		}
		scanner.close();
	}

	//check for string pallindrome
	private static boolean isPallindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		
		while(i<j) {
			if(str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}