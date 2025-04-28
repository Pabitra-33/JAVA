package com.methodimplementation;

public class Method2 {
	public static void main(String[] args) {
 		System.out.println(m2());//calling the m2 method
 	}
 	
 	static int m1() {
 		return 10;
 	}
 	
 	static int m2() {
 		return m1();//returns m1() method
 	}
}