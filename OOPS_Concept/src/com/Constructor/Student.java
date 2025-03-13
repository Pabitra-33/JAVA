package com.Constructor;

public class Student {
	String name;
	int age;
	long mobile;
	
	//defined parameterized constructor
	public Student(String name, int age, long mobile) {
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}
	
	//display method
	public void display() {
		System.out.println(name+"\n"+age+"\n"+mobile);
	}
	
	//main method
	public static void main(String[] args) {
		Student s1 = new Student("Kaveri",15,8765532917l);//calling the parameterized constructor by passing value.
		s1.display();
		Student s2 = new Student("Jivan",18,9176532917l);
		s2.display();
	}
}
