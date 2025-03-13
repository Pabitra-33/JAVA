package com.basic_progms;

class Demo
{
	static int k = 10;
}
public class Test2 {

	public static void main(String[] args) {
		//accessing another class static member
		System.out.println(Demo.k);//10
		
		Demo.k = 30;//re-initializing that static variable
		System.out.println(Demo.k);//30
		Demo.k = 3+6;//9
		System.out.println(Demo.k);
	}

}
