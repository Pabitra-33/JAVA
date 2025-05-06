package com.stringprograms;

public class CountOfWords {
	public static void main(String[] args) {
		String s = "java is programming language";
		int count = 0;
		int j = 0; //starting point
		while(j < s.length()) {
			while(j < s.length() && s.charAt(j) != ' ')
				j++;
			if(j < s.length() && s.charAt(j+1) != ' ')
				count++;
			j++;
		}
		System.out.println(count+1);
	}
}