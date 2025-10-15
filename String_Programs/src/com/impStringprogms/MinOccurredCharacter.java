package com.impStringprogms;

import java.util.Scanner;

public class MinOccurredCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.nextLine();
		
		char[] ch = s.toCharArray();//converting to character array
		int minCount = s.length();
		char minChar = '\u0000'; //or: ' '- empty character, default value of character
		
		for(int i=0; i<ch.length; i++) {
			int count = 1;
			if(ch[i] == '\u0000') continue;//skip it
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i] == ch[j]) {
					count++;
				    ch[j] = '\u0000';
			    }
			}
			//if the count is less than the mincount then assign to it
			if(count < minCount) {
				minCount = count;
				minChar = ch[i];
			}
		}
		 System.out.println("Minimum Ocurred character in the String is: "+minChar+" = "+minCount);	
		 sc.close();	
	}
}