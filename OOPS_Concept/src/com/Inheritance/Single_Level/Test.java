package com.Inheritance.Single_Level;

//created A class
class A{
	int i;
}

//created B class extending A class
class B extends A{
	int j;
}

public class Test {
	public static void main(String[] args) {
		A a = new A();//parent class object created
		a.i = 10;
		System.out.println(a.i);//10
		//System.out.println(a.j);//CTE: we can't access child class specific properties using parent class object reference
		
		B b = new B();
		b.i = 30;
		b.j = 60;
		System.out.println(b.j);
		System.out.println(b.i);
	}
}
