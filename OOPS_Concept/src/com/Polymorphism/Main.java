package com.Polymorphism;

//parent class
class Superclass {
    void display() {
        System.out.println("Parent class");
    }
}

//child class extending parent
class Subclass extends Superclass {
	@Override
    void display() {
        System.out.println("Child class");
    }
}

//execution class(implementation)
public class Main {
    public static void main(String[] args) {
        Superclass obj = new Subclass();
        obj.display();//Child class
        //Method overriding ensures that the subclass's,
        //implementation is called at runtime.
    }
}
