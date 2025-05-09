package com.impStringprogms;

public class BiggestSubStringPallindrome {
	public static void main(String[] args) {
		//given String
		String str = "malayalam";
		String maxStr = "";//to calculate the 
		
		for(int i=0; i<str.length(); i++) {
			for(int j=i+3; j<str.length(); j++) {
				String s = str.substring(i, j);
				//check for Pallindrome
				if(isPallindrome(s)) {
					if(s.length() > maxStr.length()) {
						maxStr = s;
					}
				}
			}
		}
		System.out.println("Biggest Substring pallindrome is: "+maxStr);//output: alayala
	}
	
	public static boolean isPallindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}