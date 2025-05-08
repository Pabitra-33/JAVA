package com.stringprograms;

import java.util.Scanner;

public class AddSumOfNumberInString {
	public static void main(String[] args) {
		//take user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a alpha-numeric String: ");
		String s = scanner.nextLine();
		
		int sum = 0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			//check it's a digit or not
			if(Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);//Converting char to int and adding to sum
			}
		}
		scanner.close();
        // Printing the result
        System.out.println("Sum of numbers in alphanumeric string: " + sum);

	}
}