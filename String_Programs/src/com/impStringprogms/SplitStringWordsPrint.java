package com.impStringprogms;

public class SplitStringWordsPrint {
	public static void main(String[] args) {
		String s = "Java Is Easy";//given string
		
		String word = "";
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch != ' ') {
				word += ch;
			}
			else {
				System.out.println(word);
				word = "";// reset for next word
			}
		}
		
		if(!word.isEmpty()) {
			System.out.println(word);
		}
	}
}