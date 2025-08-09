package com.impStringprogms;

public class SecondMaxOcurredCharacter {
	public static void main(String[] args) {
		//given string
		String s = "aaabbbbcddeedff";
		
		//convert to character type array
		char[] ch = s.toCharArray();
		
		int maxCount = 0, secmaxCount = 0;
		char maxChar = ' ', secMaxchar = ' '; 
		
		for(int i=0; i<ch.length; i++) {
			int count = 1;
			if(ch[i] == ' ') continue;
			for(int j = i+1; j<ch.length; j++) {
				if(ch[i] == ch[j]) {
					count++;
					ch[j] = '\u0000';
				}
			}
			
			if(count > maxCount) {
				secmaxCount = count;
				maxCount = count;
				secMaxchar = maxChar;
				maxChar = ch[i];
			}
		}
		System.out.println("Maximum Ocurred character in the String is: "+maxChar+" = "+maxCount);
        System.out.println("Second Maximum Ocurred character in the String is: "+secMaxchar+" = "+secmaxCount);
	}
}