package com.stringmethods;

public class TrimMethod {
	public static void main(String[] args) {
		String s1 = "   Hello, Friends   ";
        
        // Using trim() to remove 
        // leading and trailing whitespaces
        String s2 = s1.trim();
        
        System.out.println("Original String: '" + s1 + "'");
        System.out.println("Trimmed String: '" + s2 + "'");
	}
}