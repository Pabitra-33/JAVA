package com.wrapperclasses;

public class DemoWrapperClass {
	public static void main(String[] args) {
		//Auto-boxing
		int a = 10;
		Integer b = new Integer(a);//implicit type
		System.out.println("Primitive: "+a);//10
		System.out.println("Non-Primitive: "+b);//10
		
		//Auto-boxing (before 1.5v)
		int c = 20;
		//Integer d = new Integer.valueOf(c;)//explicit type
		
		//Auto-boxing(From 1.5v onwards)
		int e = 30;
		Integer f = e;//implicit type
		System.out.println("Primitive: "+e);//30
		System.out.println("Non-Primitive: "+f);//30
	}
}