package com.stringprograms;

//printing the vowels which are not present in our String
public class VowelsNotPresent {
	public static void main(String[] args) {
		//Given String
		String str = "Ayvak";
		String vowels = "AEIOUaeiou";
		String res = "";//to store vowels which are not present
		
		System.out.println("The vowels which are not present are: ");
		//iterate the given string
		for(int i=0; i<vowels.length(); i++) {
			//take single single character from the vowel string
			char ch = vowels.charAt(i);
			
			//check whether that character is a present or not
			if(!str.contains(ch+"")) {
				res += ch+" ";//if it's not present in the given string then add it to the result string
			}
		}
		System.out.println(res);
	}
}