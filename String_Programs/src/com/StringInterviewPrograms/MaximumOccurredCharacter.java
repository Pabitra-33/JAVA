package com.StringInterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurredCharacter {

	public static void main(String[] args) {
		String str = "Successes";
		
		//removing spaces and making it lower case
		str = str.replaceAll("\\s+", "").toLowerCase();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		char maxChar = ' ';
		int maxCount = 0;
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() > maxCount) {
				maxChar = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		System.out.println("The Maximum Occurred Character in the String is: "+maxChar);
		System.err.println("Frequency is: "+maxCount);
	}
}