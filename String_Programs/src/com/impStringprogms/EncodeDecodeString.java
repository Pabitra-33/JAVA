package com.impStringprogms;

public class EncodeDecodeString {
	public static void main(String[] args) {
		System.out.println(encode("abc",2));//cde
		System.out.println(encode("xyz",2));//zab
		System.out.println(decode("abc",2));//yza
		System.out.println(decode("xyz",2));//vwx
	}

	private static String encode(String str, int k) {
		String result = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			//for uppercase letters
			if(Character.isUpperCase(ch)) {
				char ch1 = ((char)('A'+(ch-'A'+k)%26));
				result += ch1;
			}
			//for lowercase letters
			else if(Character.isLowerCase(ch)) {
				char ch2 = ((char)('a'+(ch-'a'+k)%26));
				result += ch2;
			}
		}
		return result;
	}

	private static String decode(String str, int i) {
		return encode(str, (26-(i%26)));
	}
}