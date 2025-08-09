package com.demoExpressions;

public class RegularExpressionStringSplit {
	public static void main(String[] args) { 
	  String s="www.saijobs.com"; 
	  String[] s1=s.split("\\."); 
	  
	  for(String s2:s1) { 
		  System.out.println(s2);//www 
	                         //saijobs 
	                        //com 
	   }
	  }
}