package com.StringInterviewPrograms;

import java.util.Scanner;

public class StringAnagrams {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//taking two string inputs
		System.out.println("Enter the first String: ");
		String s1 = scn.nextLine();
		System.out.println("Enter the second String: ");
		String s2 = scn.nextLine();
		
		if(isAnagram(s1,s2)) {
			System.out.println(s1+" and "+s2+" are Anagrams!✔");
		}
		else {
			System.out.println(s1+" and "+s2+" are not Anagrams...❌");
		}
		scn.close();
	}

	//check anagram method
	private static boolean isAnagram(String s1, String s2) {
		while(true) {
			if(s1.length() != s2.length()) {
				return false;
			}
			
			if(s1.length() == 0 && s2.length() == 0) {
				return true;
			}
			
			char ch = s1.charAt(0);
			
			s1 = s1.replace(ch+"", "");
			s2 = s2.replace(ch+"", "");
		}
	}
}