package com.impStringprogms;

public class SwapStringWords {
	public static void main(String[] args) {
		String s1 = "Ram";//first word
        String s2 = "Sita";//second word

        // Step 1: Combine both strings in s1
        s1 = s1 + s2;// s1 = "RamSita"

        // Step 2: Extract original s1 from combined string and assign to s2
        s2 = s1.substring(0, s1.length() - s2.length()); // s2 = "Ram"

        // Step 3: Extract original s2 from combined string and assign to s1
        s1 = s1.substring(s2.length()); // s1 = "Sita"

        System.out.println("s1 = " + s1);//Sita
        System.out.println("s2 = " + s2);//Ram
	}
}