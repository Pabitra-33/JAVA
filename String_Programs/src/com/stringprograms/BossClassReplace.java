package com.stringprograms;

public class BossClassReplace {
	public static void main(String[] args) {
		String s = "Bossss";//given
		char[] ch = s.toCharArray();
		
		int i=0;
		int j = i+1;
		while(j < s.length()) {
			if(ch[i] == ch[j]) {
				ch[j] = '$';
			}
			i++;
			j++;
		}
		System.out.println("After replacing: ");
		System.out.println(ch);
	}
}