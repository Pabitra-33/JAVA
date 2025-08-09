package com.stringmethods;

public class ContainsMethod {
	public static void main(String[] args) {
		String s = "Java is a popular programming language";
		
		//checking whether the given word is present in the string or not
		System.out.println(s.contains("Java"));//true
		System.out.println(s.contains("not"));//false
		System.out.println(s.contains("language"));//true
	}
}