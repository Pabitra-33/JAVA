package com.operators;

public class BitwiseOperators {
	public static void main(String[] args) {
 		//bitwise operator used to internally valid by converting their binary number.
 		int a = 5;
 		int b = 7;
 		
 		int res = a & b;//bitwise and
 		System.out.println(res);//5
 		
 		int res1 = a | b;//bitwise or
 		System.out.println(res1);//7
 		
 		int res2 = a ^ b;//bitwise x-or
 		System.out.println(res2);//2
 		
 		int res3 = ~ a;//bitwise not
 		System.out.println(res3);//-6
 	}
}
