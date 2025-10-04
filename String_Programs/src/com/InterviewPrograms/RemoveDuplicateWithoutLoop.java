package com.InterviewPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateWithoutLoop {
	public static void main(String[] args) {
		String str = "Helloo";
		
		//created a linked Hash map to store unique character
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(char ch : str.toCharArray()) {
			set.add(ch);//adding the unique characters
		}
		
		//System.out.println(set);//[H, e, l, o]
		//But if they asked to return as a string, then just convert
		StringBuffer sb = new StringBuffer();
		for(char c : set) {
			sb.append(c);
		}
		System.out.println("Original String: "+str);//Original String: Helloo
		System.out.println("After Removal: "+sb);//After Removal: Helo
	}
}