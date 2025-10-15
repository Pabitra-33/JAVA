package com.impStringprogms;

import java.util.Scanner;

public class PrintPrefixes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = scanner.nextLine();
		
		String temp = "";
		
		for(int i=0; i<s.length(); i++) {
			temp += s.charAt(i); // Append one character at a time
			System.out.println(temp); //print the current prefix
		}
		scanner.close();
	}
}