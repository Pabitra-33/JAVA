package com.stringprograms;

import java.util.Scanner;

public class ReverseEachWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = scanner.nextLine();
		
		System.out.println("Before Reverse of String: "+s);
		String rev = revString(s);
		System.out.println("After Reverse of String: "+rev);
		scanner.close();
	}

	private static String revString(String s) {
		int i = 0;
		int j = 0;
		String temp = "";
		
		while(j < s.length()) {
			while(j < s.length() && s.charAt(j) != ' ') {
				j++;
			}
			int k = j-1;
			while(k >= i) {
				temp += s.charAt(k);
				k--;
			}
			
			//adding one space after each word
			if(j < s.length())
				temp += " ";
			j++;
			i = j;
		}
		return temp;
	}
}