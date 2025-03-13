package com.Inheritance.Hierarchical;

//parent or base class
class Parent {
	void parentMethod() {
		System.out.println("This is my Parent class method");
	}
}

//child1 class or subClass extends parent
class Child1 extends Parent {
	void child1Method() {
		System.out.println("This is my Child1 class method");
	}
}

//child2 class or subClass extends parent
class Child2 extends Parent {
	void child2Method() {
		System.out.println("This is my Child2 class method");
	}
}

public class ParentChildTestHierarchical {
	public static void main(String[] args) {
		Parent parentObj = new Parent();
        Child1 child1Obj = new Child1();
        Child2 child2Obj = new Child2();
        
        //Calling methods from the Parent and Child classes
        parentObj.parentMethod();
        child1Obj.parentMethod();
        child1Obj.child1Method();
        child2Obj.parentMethod();
        child2Obj.child2Method();
	}
}
