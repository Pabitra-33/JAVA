package com.Constructor;

public class C {
	//parameterized constructor created
	public C(int i)
	{
		System.out.println("C(int) class constructor:"+i);
	}
	
	//main method
	public static void main(String[] args) {
		//new C();//CTE- bcz there is no default constructor is defined
		new C(10);
		new C(30);
	}
}
