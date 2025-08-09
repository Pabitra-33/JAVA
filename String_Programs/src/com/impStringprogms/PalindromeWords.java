package com.impStringprogms;

public class PalindromeWords {
	public static void main(String[] args) {
		String s = "sir madam trainer madam sir";
		String[] words = s.split(" ");
		
		//take each word and check for pallindrome
		//if pallindrome then print
		System.out.println("Pallindrome Words are: ");
		for (String string : words) {
			if(isPallindrome(string)) {
				System.out.print(string+" ");
			}
		}
	}

	private static boolean isPallindrome(String words) {
		int i = 0;
		int j = words.length()-1;
		
		while(i < j) {
			if(words.charAt(i) != words.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}