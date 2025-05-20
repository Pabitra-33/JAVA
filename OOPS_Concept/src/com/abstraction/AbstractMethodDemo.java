package com.abstraction;

abstract class Calculator {
    abstract void display();//abstract method
}

class Add extends Calculator
{
    void display() {
        System.out.println("In the Add Child Class");
    }
    
}

class Sub extends Calculator
{
    void display() {
        System.out.println("In the Sub Child Class");
    }
    
}

class AbstractMethodDemo {
    public static void main(String arg[]) {
        Calculator add = new Add();
        add.display();
        
        Calculator sub = new Sub();
        sub.display();
    }
}