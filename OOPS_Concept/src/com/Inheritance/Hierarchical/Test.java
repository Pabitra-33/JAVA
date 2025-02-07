package com.Inheritance.Hierarchical;

//Java program to illustrate the
//concept of Hierarchical  inheritance
class A {
	//method
    public void print_A() { 
	   System.out.println("Class A"); 
	}
}

class B extends A {
   public void print_B() { 
	   System.out.println("Class B"); 
	}
}

class C extends A {
   public void print_C() { 
	  System.out.println("Class C");
   }
}

class D extends A {
   public void print_D() { 
	  System.out.println("Class D"); 
   }
}

//Driver Class
public class Test {
 public static void main(String[] args)
 {
     B obj1 = new B();
     obj1.print_A();
     obj1.print_B();

     C obj2 = new C();
     obj2.print_A();
     obj2.print_C();

     D obj3 = new D();
     obj3.print_A();
     obj3.print_D();
 }
}
