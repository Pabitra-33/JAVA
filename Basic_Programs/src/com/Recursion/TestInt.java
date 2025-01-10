package com.Recursion;

public class TestInt {

	public static void main(String[] args) {
		m1(1);
	}
	//it's a recursive call.
	public static void m1(int i)
	{
		System.out.println(i);
		if(i>=3) return;
		m1(i+1);
	}
}
