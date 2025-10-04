package com.InterviewPrograms;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Hello";
		
		char[] words = s.toCharArray();
		String reversed = "";
		
		for(int i=words.length-1; i>=0; i--) {
			reversed += words[i];
		}
		System.out.println("Original String: "+s);
		System.out.println("Reversed String: "+reversed);
	}
}