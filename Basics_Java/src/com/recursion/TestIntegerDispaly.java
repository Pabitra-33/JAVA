package com.recursion;

public class TestIntegerDispaly {
	public static void main(String[] args) {
 		m1(1);
 	}
 	
	//recursive call.
 	public static void m1(int i) {
 		System.out.println(i);
 		if(i>=3) return;
 		m1(i+1);
 	}
}