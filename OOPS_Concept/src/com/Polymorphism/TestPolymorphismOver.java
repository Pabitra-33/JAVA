package com.Polymorphism;

class Parent {
    // Method of parent class
    void marriage() {
        System.out.println("Get married to Bhanupriya");
    }
}

class Child1 extends Parent {
	@Override
    void marriage() { 
      System.out.println("Only marry to Sabitri"); 
    }
}

class Child2 extends Parent {
	@Override
    void marriage() {
        System.out.println("Only marry to Bhanupriya");
    }
}

public class TestPolymorphismOver{
	public static void main(String[] args) {
		Parent p1 = new Child1();
		p1.marriage();
		
		Parent p2 = new Child2();
		p2.marriage();
	}
}