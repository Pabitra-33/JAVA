package com.stringmethods;

public class EqualsMethod {
	public static void main(String[] args) {
		//taken three strings
		String str1 = "Learn Java";
        String str2 = "Learn Java";
        String str3 = "Learn Kotlin";
        
        //to store the result
        boolean result;

        // Comparing str1 with str2
        result = str1.equals(str2);
        System.out.println(result);//true

        // Comparing str1 with str3
        result = str1.equals(str3);
        System.out.println(result);//false

        // Comparing str3 with str1
        result = str3.equals(str1);
        System.out.println(result);//false
	}
}