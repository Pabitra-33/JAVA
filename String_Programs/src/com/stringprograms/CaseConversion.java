package com.sreingprograms;

public class CaseConversion {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "PYthon";
		System.out.println("Before case conversion:\nS1= "+s1+" and S2= "+s2);
		
		//converting the Lowercase to Uppercase & Uppercase to Lowercase
		s1 = s1.toUpperCase();
		s2 = s2.toLowerCase();
		System.out.println("After case conversion:\nS1= "+s1+" and S2= "+s2);
	}
}