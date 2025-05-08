package com.stringprograms;

public class ReplaceToDollar {
	public static void main(String[] args) {
		//given string
		String s = "BDDOSSSS";
		char[] ch = s.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='\u0000') continue;//skip it
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i] == ch[j]) {
					ch[j] = '$';
				}
				i++;
			}
		}
		System.out.println(ch);
	}
}