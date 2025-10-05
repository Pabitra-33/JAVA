package com.InterviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacterInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		//finding the first non-repeating character
		char firstNonRepeated = '\0';
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				firstNonRepeated = entry.getKey();
				break;
			}
		}
		
		if(firstNonRepeated != '\0') {
			System.out.println("The First Non-repeated character is: "+firstNonRepeated);
		}
		else {
			System.out.println("There was no non-repeated character present!");
		}
		sc.close();
	}
}