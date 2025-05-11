package com.impStringprogms;

public class RemoveExtraSpace {
	public static void main(String[] args) {
		String s = "   Java    Is  Very   Easy  ";
		String temp = "";//to store the result
		
		int i = 0;//two pointers
		int j = 0;
		
		while(j < s.length()) {
			while(j < s.length() && s.charAt(j)!=' ') j++;
			
			if(s.charAt(i) != ' ') {
				while(i < j) {
					temp += s.charAt(i);
					i++;
				}
				if(j<s.length()) temp += " ";
			}
			i++;
			j++;
		}
		System.out.println(temp.trim());//removing extra spaces from start and end
	}
}