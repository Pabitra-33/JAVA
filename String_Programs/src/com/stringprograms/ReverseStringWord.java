package com.stringprograms;

import java.util.Scanner;

public class ReverseStringWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = scanner.nextLine();
		
		System.out.println("Before reverse: "+str);
		String rev = revString(str);
		System.out.println("After reverse: "+rev);
		scanner.close();
	}

	private static String revString(String str) {
		int i = str.length()-1;
		int j = str.length()-1;
		String reverse = "";
		
		while(i >= 0) {
			while(i >= 0 && str.charAt(i) != ' ')
				i--;
			int k = i+1;
			while(k <= j) {
				reverse += str.charAt(k);
				k++;
			}
			
			//to add space
			if(i>0) {
				reverse += " ";
			}
			i--;
			j = i;
		}
		return reverse;
	}
}