package com.stringmethods;

public class CompareToMethod {
	public static void main(String[] args) {
		String str1 = "Javaa";
        String str2 = "Python";

        int comparison = str1.compareTo(str2);

        if (comparison < 0) {
            System.out.println(str1 + " comes before " + str2 + " lexicographically.");
        } else if (comparison > 0) {
            System.out.println(str1 + " comes after " + str2 + " lexicographically.");
        } else {
            System.out.println(str1 + " and " + str2 + " are lexicographically equal.");
        }
	}
}