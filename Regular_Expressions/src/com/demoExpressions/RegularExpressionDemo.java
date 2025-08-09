package com.demoExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {
	public static void main(String[] args) { 
	  int count=0; 
	  //pattern class
	  Pattern p=Pattern.compile("ab"); 
	  //matcher class
	  Matcher m=p.matcher("abbbabbaba"); 
	  while(m.find()) //finding the matched pattern
	  { 
	       count++; 
	       System.out.println(m.start()+"------"+m.end()+"------"+m.group()); 
	  } 
	  System.out.println("The no of occurences :"+count); 
	 }
}