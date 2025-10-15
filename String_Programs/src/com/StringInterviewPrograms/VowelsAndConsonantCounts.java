package com.StringInterviewPrograms;

import java.util.Scanner;

public class VowelsAndConsonantCounts {
	public static void main(String[] args) {
		//created the object to take input
		Scanner sc = new Scanner(System.in);
		
		// String str = "Shyama Ki Jay";
		
		String str = sc.nextLine();
		str = str.toLowerCase();
		int vowelCount = 0;
		int consonantCount = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;//if the character is a vowel, then increase vowelCount by 1
				}
				else {
					consonantCount++;
				}
			}
		}
		System.out.println("Vowel Counts is: "+vowelCount);
		System.out.println("Consonant Counts is: "+consonantCount);
		sc.close();
	}
}