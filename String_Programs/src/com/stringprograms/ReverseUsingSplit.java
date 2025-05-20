package com.stringprograms;

public class ReverseUsingSplit {
	public static void main(String[] args) {
		//given string
		String s = "java is easy";
		String[] s1 = s.split(" ");
		
		for(int i=s1.length-1; i>=0; i--) {
			System.out.print(s1[i]+" ");
		}
	}
}