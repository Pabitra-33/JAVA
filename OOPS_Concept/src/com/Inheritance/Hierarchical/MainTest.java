package com.Inheritance.Hierarchical;

//parent class
class ParentClass {
  int PAge = 10;
}

//child or subclasses
class ChildClass1 extends ParentClass {
  int CAge1 = 1;
}
class ChildClass2 extends ParentClass {
  int CAge2 = 2;
}
class ChildClass3 extends ParentClass {
  int CAge3 = 3;
}

//implementation class
public class MainTest {
	public static void main(String args[]) {
	    ChildClass1 C1 = new ChildClass1();
	    ChildClass2 C2 = new ChildClass2();
	    ChildClass3 C3 = new ChildClass3();

	    System.out.println("PAge * CAge1 = " + C1.PAge * C1.CAge1);	
	    System.out.println("PAge * CAge2 = " + C2.PAge * C2.CAge2);	
	    System.out.println("PAge * CAge3 = " + C3.PAge * C3.CAge3);	
	}
}