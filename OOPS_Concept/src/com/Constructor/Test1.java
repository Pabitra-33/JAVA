package com.Constructor;

class AB{
	{
		System.out.println("Non-static block-A");
	}
	
	static {
		System.out.println("Static block-A");
	}
	//no-arg const
	AB(){
		System.out.println("Constructor-A()");
	}
	////arg const
	AB(int i){
		this();
		System.out.println("Constructor-A(): "+i);
	}
}

public class Test1 {
	static {
		System.out.println("Static Block-Test");
	}
	
	{
		System.out.println("Non-Static Block-Test");
	}
	//main method
	public static void main(String[] args) {
		System.out.println("Main Starts");
		new AB(10);
		System.out.println("Main Ends");
		new Test();
	}
}
