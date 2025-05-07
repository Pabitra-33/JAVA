package com.stringprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupOfNoSumInStrings {
	public static void main(String[] args) {
		String str = "ab34drg12";//given string
		
		int sum = 0;
		
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			sum += Integer.parseInt(m.group());//grouping the elements
		}
		
		System.out.println("Group numbers sum = "+sum);//46
	}
}