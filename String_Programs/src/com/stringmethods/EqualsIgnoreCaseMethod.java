package com.stringmethods;

public class EqualsIgnoreCaseMethod {
	public static void main(String[] args) {
		String str1 = "Love FOr jaVA";
        String str2 = "love foR JAVa";
        String str3 = "JAVa iS PROgramminNG";

        // Comparing str1 and str2
        boolean res1 = str2.equalsIgnoreCase(str1);

        System.out.println("str2 is equal to str1 = "+ res1);//true ignore the case of the letters

        // Comparing str2 and str3
        boolean res2 = str2.equalsIgnoreCase(str3);

        System.out.println("str2 is equal to str3 = "+ res2);//false
	}
}