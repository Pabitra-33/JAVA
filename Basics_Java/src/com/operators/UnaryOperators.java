package com.operators;

public class UnaryOperators {
	public static void main(String[] args) {
 		//Increment Operator
 		int a = 0;
 		int b = ++a + 3;//(++a)pre-increment(first increase then assign).
 		int c = a++ + 5;//(a++)post-increament(first assign then increase).
 		
 		System.out.println(a);//2
 		System.out.println(b);//4
 		System.out.println(c);//6
 		
 		//Decrement Operator
 		int x = 6;
 		int y = --x + 2;//(++a)pre-increment(first increase then assign).
 		int z = x-- + 3;//(a--)post-decrement(first assign then increase).
 		
 		System.out.println(x);//4
 		System.out.println(y);//7
 		System.out.println(z);//8
 	}
}
