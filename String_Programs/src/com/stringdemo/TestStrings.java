package com.stringdemo;

public class TestStrings {
	public static void main(String[] args) {
		
		// String literal
		String str1 = "Hello";
		
		// Using the String constructor
		String str2 = new String("World"); 
		
		char[] charArray = {'J', 'a', 'v', 'a'};
		String str3 = new String(charArray); // Creating string from char array
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}