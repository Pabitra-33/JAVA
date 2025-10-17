package com.StringInterviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharactersInString {
	public static void main(String[] args) {
		String str = "Programming Java";
		
		//converting to lower case
		str = str.toLowerCase();
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		System.out.println("Non-repeating characters of word "+"("+str+")"+" are : ");
		
		boolean found = false;
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.print(entry.getKey()+" ");
				found = true;
			}
		}
		
		if(!found) {
			System.out.println("No non-repeating character present.!");
		}
	}
}