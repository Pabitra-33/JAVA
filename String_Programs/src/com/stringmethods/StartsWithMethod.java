package com.stringmethods;

public class StartsWithMethod {
	public static void main(String[] args) {
		// Declare and initialize a String
        String s = "Java Programming";

        // Check if the string starts with "Java"
        boolean r = s.startsWith("Java");

        System.out.println("" + r);//returns true if the word starts with that word
	}
}