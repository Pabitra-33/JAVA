package com.stringmethods;

public class MatchesMethod {
	public static void main(String[] args) {
		// a regex pattern for
	    // four letter string that starts with 'J' and end with 'a'
	    String regex = "^J..a$";

	    System.out.println("Java".matches(regex));
	}
}