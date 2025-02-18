package com.Inheritance.Multiple;

class A{
    public void execute(){
        System.out.println("Hi.. Executing From Class A");
    }
}
class B{
    public void execute(){
        System.out.println("Hi.. Executing From Class B");
    }
}
//class C extends A, B //Compile Time Error(multiple inheritance)
class C extends A {
    
}
public class Main{
	public static void main(String[] args) {
        C obj = new C(); // creating object of class C
        obj.execute(); // execute() method is present in both class A and B
	}
}

