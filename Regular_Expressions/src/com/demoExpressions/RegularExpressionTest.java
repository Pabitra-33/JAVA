package com.demoExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {
	public static void main(String[] args) {
		//finding the pattern in the String
		Pattern p=Pattern.compile("x"); 
		Matcher m=p.matcher("a1xb7 x@z#"); 
		while(m.find()) { 
			  System.out.println(m.start()+"------"+m.group()); 
		 }
	}
}