package com.stringprograms;

public class NameToMultipleSubName {
	public static void main(String[] args) {
		//given string name Ramana sir
		String name = "Ramana";
		
		String temp = "";
		for(int i=0; i<name.length(); i++) {
			temp += name.charAt(i);
			System.out.println(temp);
		}
	}
}