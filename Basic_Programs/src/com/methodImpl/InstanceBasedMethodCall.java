package com.methodImpl;

class Demo{
	int i;
	void m2() {
		System.out.println(i);
	}
}

public class InstanceBasedMethodCall {
	public static void main(String[] args) {
		Demo d1 = new Demo();//creating Demo class instance
		d1.i = 10;
		
		Demo d2 = new Demo();//creating Demo class instance
		d2.i = 30;
		
		Demo d3 = new Demo();//creating Demo class instance
		d3.i = 60;
		
		//based on the instance call the method assigns values.
		d1.m2();//10
		d2.m2();//30
		d3.m2();//60
	}
}
