package com.stringmethods;

import java.util.Arrays;

public class ToCharArrayMethod {
	public static void main(String[] args) {
		String str = "I Love Java Programming";
		
		//converting String to Character type array
		char[] arr = str.toCharArray();
		
		System.out.println("String is: "+str);
		System.out.println("Character array is: "+ Arrays.toString(arr));
	}
}