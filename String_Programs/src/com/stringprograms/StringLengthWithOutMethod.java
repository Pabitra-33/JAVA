package com.stringprograms;

import java.util.Scanner;

public class StringLengthWithOutMethod {
	public static void main(String[] args) {
		String s = "java is easy";
		Scanner sc = new java.util.Scanner(s);
		//sc.useDelimiter("");//12 (String length without any built-in method)
		sc.useDelimiter(" ");//3 (String words length)
		int count = 0;
		while(sc.hasNext()) {
			sc.next();
			count++;
		}
		System.out.println(count);
		sc.close();
	}
}