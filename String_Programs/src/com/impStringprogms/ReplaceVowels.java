package com.impStringprogms;

public class ReplaceVowels {
	public static void main(String[] args) {
		//given String
		String s = "Surajpura";
		String vowels = "aeiouAEIOU";
		String res = "";
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(!vowels.contains(ch+""))
				res += ch;
		}
		System.out.println(res);
	}
}