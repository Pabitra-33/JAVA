package com.stringdemo;

public class CreationOfString {
	public static void main(String[] args) {
		
		//creating string objects using new keyword
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		//creating string objects using literals
		String s3 = "SQL";
		String s4 = "SQL";
		
		System.out.println(s1 == s2);//false (as == checks the reference address)
		System.out.println(s1.equals(s2));//true (as equals() checks the value)
		
		System.out.println(s3 == s1);//false
		System.out.println(s3 == s4);//true, because while creating with literals the objects points to the same address
		System.out.println(s3.equals(s4));//true
	}
}