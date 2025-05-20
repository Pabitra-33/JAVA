package com.methodimplementation;

public class Method1 {
	public static void main(String[] args) {
 		m1();//calling m1() method (valid)
 		
 		int i = m1();//valid m1() call
 		System.out.println("i = "+i);
 		
 		int j = m1() * 20;//valid to perform any operation with that method returned value
 		System.out.println("j = "+j);
 		System.out.println(m1());
 	}
 	
 	static int m1() {
 		System.out.println("Implementation of m1()");
 		return 10;
 	}
}