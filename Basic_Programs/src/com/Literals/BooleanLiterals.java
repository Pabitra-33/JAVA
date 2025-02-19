package com.Literals;

public class BooleanLiterals {
	public static void main(String[] args) {
		boolean b = true; //valid
		boolean c = false; //valid
		//boolean f = 0;//invalid CE incompatible types: int cannot be converted to Boolean.
		//boolean v = True; //invalid CE: can’t find Symbol variable: True location: Test
		//boolean s = "true"; // invalid CE: incompatible types: string cannot be converted to Boolean.
		System.out.println("Boolean value of b= "+b);
		System.out.println("Boolean value of c= "+c);
		
		//infinity times print
		while(true){
			System.out.println("Hello");//prints hello until stack memory not full
		}
	}
}
