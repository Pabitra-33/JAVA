package com.stringmethods;

public class ReplaceMethod {
	public static void main(String[] args) {
		// Initializing String
        String Str = new String("Welcome to Java World");
 
        // Using replace to replace characters
        System.out.print("After replacing all o with T : ");
        System.out.println(Str.replace('o', 'T'));
 
        // Using replace to replace characters
        System.out.print("After replacing all e with D : ");
        System.out.println(Str.replace('e', 'D'));
	}
}