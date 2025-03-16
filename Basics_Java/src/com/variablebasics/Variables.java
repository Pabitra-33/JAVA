package com.variablebasics;

public class Variables {
 	static int j = 10;//static variable
 	String name = "Kailash";//non-static or instance variable
 	
 	public static void main(String[] args) {
 		int k = 5;//local variables
 		System.out.println(k);//5
 		//by using className we can refer the static variables in java
 		System.out.println(Variables.j);//10
 		
 		//to access non-static variables we need to create instance of the class.
 		//and by using that reference we can refer the instance variables of a class.
 		Variables v = new Variables();
 		System.out.println(v.name);//"Kailash"
 	}
 }
