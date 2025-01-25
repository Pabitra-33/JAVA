package com.Classes;

//created my class
public class MyClass 
{
	public static void main(String[] args) {
		Test t = new Test(30);
		t.display();
	}
}

class Test{
	private int age;
	
	//constructor to initialize
    public Test(int age) {
        this.age = age;
    }
    
    //display method
    public void display() {
        System.out.println("Age: " + age);
    }
}
