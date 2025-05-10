package com.impStringprogms;

public class SecondBigSubStringPallindrome {
	public static void main(String[] args) {
		String str = "malayalam";
		String maxStr = "";
		String secMax = "";
		
		//finding the substring pallindrome
		for(int i=0; i<str.length(); i++) {
			for(int j=i+3; j<str.length(); j++) {
				String subStr = str.substring(i,j);
				//check for pallindrome
				if(isPallindrome(subStr)) {
					if(subStr.length() > maxStr.length()) {
						secMax = maxStr;
						maxStr = subStr;
					}
				}
			}
		}
		System.out.println("Biggest substring pallindrome is: "+maxStr);
		System.out.println("Second biggest substring pallindrome is: "+secMax);
	}

	private static boolean isPallindrome(String s) {
		int i = 0;
		int j = s.length()-1;
		
		while(i < j) {
			if(s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}