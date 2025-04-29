package com.stringmethods;

public class ToLowerCaseMethod {
	public static void main(String[] args) {
		String str = "My Name Is PK Sahoo";
		System.out.println("Normal String: "+ str);//My Name Is PK Sahoo
		
		//converting to lower case using methods
		str = str.toLowerCase();
		System.out.println(str);//my name is Pk sahoo
	}
}