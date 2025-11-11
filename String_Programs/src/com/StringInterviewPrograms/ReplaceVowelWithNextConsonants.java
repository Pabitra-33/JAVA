package com.StringInterviewPrograms;

public class ReplaceVowelWithNextConsonants {
	public static void main(String[] args) {
		//Given String
		String str = "Java Is Fun";
		String[] words = str.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		//take each word from the sentence
		for(String word : words) {
			char[] chars = word.toCharArray();
			
			for(int i=0; i<chars.length-1; i++) {
				char ch=chars[i];
				
				if("aeiou".contains(ch+"")) {
					if(chars[i+1]=='a'|| chars[i+1]=='e'|| chars[i+1] =='i'|| chars[i+1]=='o'|| chars[i+1]=='u') {
						continue;
					}
					chars[i] = chars[i+1];
				}
				result.append(chars[i]);
			}
			result.append(" ");
		}
		System.out.println(result);
	}
}