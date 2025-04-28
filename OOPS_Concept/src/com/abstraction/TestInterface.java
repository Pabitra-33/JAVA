package com.abstraction;

interface Int {
	int i = 10;//by default public static final int i = 10
	void m1();//by default public abstract void m1()
}

class A implements Int {
	@Override
	public void m1() {
		System.out.println("m1() in A class");
	}
}
public class TestInterface {
	public static void main(String[] args) {
		//Int i = new Int();//CTE
		Int i1 = new A();
		i1.m1();//m1() in A class
		System.out.println("Variable i: "+Int.i);//accessing the static variable of the interface
	}
}