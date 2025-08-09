package com.impStringprogms;

//if both string's contain the same characters and 
//their length is equal then they are called anagrams.
public class StringAnagrams {
	public static void main(String[] args) {
		//taking two Strings
		String s1 = "care";
		String s2 = "race";
		
		if(isAnagram(s1,s2)) {
			System.out.println(s1+" and "+s2+" are Anagrams!");
		} else {
			System.out.println(s1+" and "+s2+" are not Anagrams...");
		}
	}

	private static boolean isAnagram(String s1, String s2) {
		while(true) {
			if(s1.length() != s2.length()) //if length is not same
				return false;
			
			if(s1.length()== 0 && s2.length()==0)
				return true;
			
			char ch = s1.charAt(0);
			s1 = s1.replace(ch+"", "");//replace from s1
			s2 = s2.replace(ch+"", "");//replace from s2
		}
	}
}