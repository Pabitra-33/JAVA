package com.stringmethods;

import java.util.Scanner;

public class SplitMethod {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		System.out.println("Enter a String: ");
		String s = scanner.nextLine();
		System.out.println("String Length is: " +s.length());//printing string length
		
		String[] str = s.split(" ");//spliting the String in to array using split method
		System.out.println("String array length is: " +str.length);
		
		//close the connection
		scanner.close();
	}
}