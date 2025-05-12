package com.impStringprogms;

import java.util.Scanner;

public class StringInitCap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();//given string
		
		//convert to character type array
		char[] ch = s.toCharArray();
		
		for(int i =0; i<ch.length; i++) {
			if(ch[i] > 'a' && ch[i] < 'z') {
				//if the character is the first letter of the String
				//then convert it to Uppercase letter
				if(i == 0 || ch[i-1] ==' ') {
					ch[i] -= 32;//making that lowercase letter to uppercase
				}
			}
		}
		System.out.println(ch);
		sc.close();//close the scanner connection
	}
}