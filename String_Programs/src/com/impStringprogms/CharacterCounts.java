package com.impStringprogms;

public class CharacterCounts {
	public static void main(String[] args) {
		//given String
		String str = "aabbcdde";
		
		//creating a String builder object
		StringBuilder result = new StringBuilder();
		
		int count = 1;
		
		for(int i=0; i<str.length(); i++) {
			//if the next character is the same character then increase the count
			if(i+1 < str.length() && str.charAt(i) == str.charAt(i+1)) {
				count++;
			}
			else {
				//append the character and it's count value
				result.append(str.charAt(i)).append(count);
				count = 1; //reset the count
			}
		}
		System.out.println(result.toString());//a2b2c1d2e1
	}
}