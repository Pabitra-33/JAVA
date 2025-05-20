package com.impStringprogms;

public class OccurenceOfCharacter {
	public static void main(String[] args) {
		String str = "love java";
		
		//convert to character type array
		char[] ch = str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			int count = 1;
			if(ch[i] == '\u0000') continue;//if empty character found then skip it.
			for(int j = i+1; j<ch.length; j++) {
				if(ch[i] == ch[j]) {
					count++;
					ch[j] = '\u0000';//make the repeated character as empty
				}
			}
			System.out.println(ch[i]+" = "+count);
		}
	}
}