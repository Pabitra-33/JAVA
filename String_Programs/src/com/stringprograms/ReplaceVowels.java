package com.stringprograms;

public class ReplaceVowels {
	public static void main(String[] args) {
		String s = "AEIOUaeiou";
		String s1 = "Jspiders";//given string
		System.out.println("Before removing vowels: "+s1);
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			s1 = s1.replace(ch+"", "");
		}
		System.out.println("After removing vowels: "+s1);
	}
}