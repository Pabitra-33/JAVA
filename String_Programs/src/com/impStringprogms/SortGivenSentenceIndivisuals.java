package com.impStringprogms;

public class SortGivenSentenceIndivisuals {
	public static void main(String[] args) {
		String sen = "banana apple";
		
		System.out.println("Before sorting: "+sen);//output:-> "banana apple"
		String res = sortSentence(sen);
		System.out.println("After sorting: "+res);//output:-> "aaabnn aelpp"
	}

	private static String sortSentence(String word) {
		String result = "";
		//split the String based on space
		String[] str = word.split(" ");
		//divide them to two different Strings
		String s1 = str[0];
		String s2 = str[1];
		
		//convert the Strings to character type array
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		//for the first character array
		for(int i=0; i<ch1.length-1; i++) {
			for(int j=0; j<ch1.length-1-i; j++) {
				if(ch1[j] > ch1[j+1]) {
					char temp =ch1[j];
					ch1[j] = ch1[j+1];
					ch1[j+1] = temp;
				}
			}
		}
		
		//for the second character array
		for(int i=0; i<ch2.length-1; i++) {
			for(int j=0; j<ch2.length-1-i; j++) {
				if(ch2[j] > ch2[j+1]) {
					char temp = ch2[j];
					ch2[j] = ch2[j+1];
					ch2[j+1] = temp;
				}
			}
		}
		
		//now add the sorted characters to the string to return as String
		for(int i=0; i<ch1.length; i++) {
			result += ch1[i];
		}
		//add a space between the words
		result += " ";
		
		for(int i=0; i<ch2.length; i++) {
			result += ch2[i];
		}
		
		return result;
	}
}