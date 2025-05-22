package com.demoExpressions;

import java.util.regex.Pattern;

public class TestRegexPattern {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\."); // or [.]
		String[] s = p.split("www.javajobs.com");
		for(String words: s) {
			System.out.println(words);//www
			                          //javajobs
			                          //com
		}
	}
}