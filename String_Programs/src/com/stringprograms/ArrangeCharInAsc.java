package com.stringprograms;

public class ArrangeCharInAsc {
	public static void main(String[] args) {
		//given String str
		String str = "acdehfgb";
		
		//converting the String to character array
		char[] ch = str.toCharArray();
		System.out.println("Before arranging in asc: ");
		System.out.println(ch);
		
		//arranging them in ascending order
		for (int i = 0; i < ch.length; i++) {
			for(int j = i+1; j < ch.length; j++) {
				if(ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println("-----------------");
		System.out.println("After arranging in ascending order: ");
		System.out.println(ch);
	}
}