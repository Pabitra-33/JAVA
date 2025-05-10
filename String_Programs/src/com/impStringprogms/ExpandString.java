package com.impStringprogms;

public class ExpandString {
	public static void main(String[] args) {
		String s = "a3b3c3";
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<s.length(); i+=2) {
			char ch = s.charAt(i);// Get the character
            int count = s.charAt(i + 1) - '0'; // Convert char digit to int

            for (int j = 0; j < count; j++) {
                result.append(ch); // Append character 'count' times
            }
		}
		System.out.println("Expanding the string: "+result.toString());
	}
}