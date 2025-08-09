package com.stringprograms;

public class RemoveDuplicateReplace {
	public static void main(String[] args) {
		String s = "java programming";
		String result = "";
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			//If the character is not already in result, add it
			if(result.indexOf(ch) == -1) {
				result += ch;
				
				//replace all future occurrences of this character
				s = s.replace(ch, ' ');
			}
		}
		System.out.println(result);
	}
}