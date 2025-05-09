package com.stringprograms;

public class StringEachCharReverse {
	public static void main(String[] args) {
		String s = "java is easy";//given string
		System.out.println(rev(s)); //output: ysae si avaj
	}
	
	public static String rev(String s) {
		int j = s.length()-1;
		String rev="";
		while(j >= 0) {
			rev += s.charAt(j);
			j--;
		}
		return rev;
	}
}