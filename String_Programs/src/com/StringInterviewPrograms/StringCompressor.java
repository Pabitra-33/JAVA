package com.StringInterviewPrograms;

public class StringCompressor {
	public static void main(String[] args) {
		String str = "aaabbcdd";
		System.out.println(compressString(str)); //Output: a3b2c1d2
	}

	// string compress method
	public static String compressString(String s) {
		// first checking whether the String is null or empty
		if (s == null || s.isEmpty()) {
			return "";
		}

		StringBuilder result = new StringBuilder();// to store result
		int count = 1;

		// traversing the string and performing string compression
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				result.append(s.charAt(i - 1)).append(count);
				count = 1;
			}
		}

		// Append last character and its count
		result.append(s.charAt(s.length() - 1)).append(count);

		return result.toString();
	}
}