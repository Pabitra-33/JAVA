package com.impStringprogms;

public class PanagramString {
	public static void main(String[] args) {
		//take a String
		String input = "A Quick Brown Fox Jumps Over The Lazy Dog";
		
		//check is it a Panagram String
		if(isPanagram(input)) {
			System.out.println("It is a Panagram String!");
		} else {
			System.out.println("It is not a Panagram String...");
		}
	}

	private static boolean isPanagram(String str) {
		//first checks whether the string contains all alphabets or not
		//we can check using the length
		if(str.length() < 26) {
			return false;
		}
		
		//convert to a single case either Uppercase or Lowercase
		str = str.toLowerCase();
		//runs a loop from a-z
		for(char ch = 'a'; ch<='z'; ch++) {
			//check whether that string contain those letters or not
			if(!str.contains(ch+"")) {
				return false;
			}
		}
		
		return true;
	}
}