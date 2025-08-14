package com.regexprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestValidIdentifier {

	public static void main(String[] args) {
		
		Pattern p1 = Pattern.compile("[a-zA-Z][a-zA-Z0-9-#]+");
		
		//or
		//Pattern p=Pattern.compile("[a-zA-Z][a-zA-Z0-9#][a-zA-Z0-9-#]*");
		Matcher m = p1.matcher(args[0]);
		if(m.find() && m.group().equals(args[0])) {
			System.out.println("Valid Identifier");
		}
		else {
			System.out.println("Invalid identifier");
		}
	}
}