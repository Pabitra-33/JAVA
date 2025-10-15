package com.demoExpressions;

import java.util.regex.Pattern;

public class RegularExpressionSplit {
	public static void main(String[] args) { 
	  Pattern p=Pattern.compile("\\s"); 
	  String[] s=p.split("ashok software solutions"); 
	  for(String s1:s) { 
	   System.out.println(s1);//ashok 
	                         //software 
	                        //solutions 
	  }
	} 
}