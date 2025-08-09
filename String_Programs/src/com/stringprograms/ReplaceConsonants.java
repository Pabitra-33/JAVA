package com.stringprograms;

public class ReplaceConsonants {
	public static void main(String[] args) {
		String s = "AEIOUaeiou";
		String s1="Amaran";
		char[] ch = s1.toCharArray();
		int count = 0;
		for(int i=0; i<ch.length; i++) {
			if(!s.contains(ch+"")) count++;
		}
		if(count >= 3) {
			for(int j=0; j<ch.length; j++) {
				if(!s.contains(ch[j]+"")) {
					ch[j] = '_';
				}
			}
		}
		System.out.println(ch);
	}
}