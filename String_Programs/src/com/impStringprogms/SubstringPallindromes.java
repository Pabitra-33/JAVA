package com.impStringprogms;

public class SubstringPallindromes {
	public static void main(String[] args) {
		String s = "malayalam";//given string
		System.out.println("Possible Substring Pallindromes are: ");
		
		for(int i=0; i<s.length(); i++) {
			for(int j = i+3; j<s.length(); j++) {
				String str = s.substring(i, j);
				//check this substring for
				if(isPallindrome(str)) {
					System.out.println(str);
				}
			}
		}
	}

	//check for pallindrome method
	private static boolean isPallindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;//if the character not matches then return false
			}
			i++;
			j--;
		}
		return true;
	}
}