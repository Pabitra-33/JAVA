package com.inheritance;

class Parents {
	int k = 10;
	void parent() {
		System.out.println("Parent class method");
	}
}

class Child1 extends Parents {
	void child1() {
		System.out.println("Child1 method");
	}
}

class Child2 extends Parents {
	void child2() {
		System.out.println("Child2 method");
	}
}

class Child3 extends Parents {
	void child3() {
		System.out.println("Child3 method");
	}
}

//implementation class
public class HierarchicalInheritance {
	public static void main(String[] args) {
		Child1 ch1 = new Child1();
		ch1.k = 10;
		System.out.println(ch1.k);
		ch1.parent();
		ch1.child1();
		System.out.println("-----------");
		
		Child2 ch2 = new Child2();
		ch2.k = 30;
		System.out.println(ch2.k);
		ch2.parent();
		ch2.child2();
		System.out.println("-----------");
		
		Child3 ch3 = new Child3();
		ch3.k = 50;
		System.out.println(ch3.k);
		ch3.parent();
		ch3.child3();
	}
}