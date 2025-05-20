package com.impStringprogms;

import java.util.Scanner;

public class MaxOccurredCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.nextLine();
		
		char[] ch = s.toCharArray();//converting to character array
		int maxCount = 0;
		char maxChar = '\u0000'; //or: ' '- empty character, default value of character
		
		for(int i=0; i<ch.length; i++) {
			int count = 1;
			if(ch[i] == '\u0000') continue;//skip it
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i] == ch[j]) {
					count++;
				    ch[j] = '\u0000';
			    }
			}
			//if the count is greater than maxcount, then assign to it
			if(count > maxCount) {
				maxCount = count;
				maxChar = ch[i];
			}
		}
		 System.out.println("Maximum Ocurred character in the String is: "+maxChar+" = "+maxCount);	
		 sc.close();	
	}
}