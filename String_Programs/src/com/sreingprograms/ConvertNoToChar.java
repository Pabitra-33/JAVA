package com.sreingprograms;

public class ConvertNoToChar {
	public static void main(String[] args) {
		
		String s = "a3b2c4";
		char[] ch = s.toCharArray();
		String temp = "";
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>='0' && ch[i]<='9') continue;
			for(int j=1; j<=(ch[i+1]-'0');j++) {
				temp += ch[i];
			}
		}
		System.out.println(temp);
	}
}