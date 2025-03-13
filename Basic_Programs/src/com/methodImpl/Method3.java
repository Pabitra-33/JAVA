package com.methodImpl;

public class Method3 {
	public static void main(String[] args) {
		int i= 0;
		int j = 0;
		j = m1(i++);
		j = m2(++i);
		System.out.println("i = "+i);
		System.out.println("j = "+j);
	}
	
	static int m1(int a)
	{
		return a++;
	}
	
	static int m2(int b)
	{
		return b++;
	}
}
