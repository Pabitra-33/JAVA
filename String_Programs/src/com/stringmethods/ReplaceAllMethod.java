package com.stringmethods;

public class ReplaceAllMethod {
	public static void main(String[] args) {
		//given string
		String str1 = "Java123is456fun";

	    // regex for sequence of digits
	    String regex = "\\d+";

	    // replace all occurrences of numeric
	    // digits by a space
	    System.out.println(str1.replaceAll(regex, " "));
	}
}