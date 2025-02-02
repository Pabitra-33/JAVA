package com.copyConstructor;

public class Student {
	String name;
	int age;
	long mobile;
	
    public Student() {
		//default constructor
	}
	
	//parameterized student constructor
	public Student(String name, int age, long mobile) {
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}

	//Student instance referenced constructor
	public Student(Student s) {
		this.name = s.name;
		this.age = s.age;
		this.mobile = s.mobile;
	}
	
	//display method
	public void display() {
		System.out.println(name+"\n"+age+"\n"+mobile);
	}
	
	//main method
	public static void main(String[] args) {
		Student s1 = new Student("Ram", 27, 887652196l);
		Student s2 = new Student("Sruti", 24, 975236159l);
		Student s3 = new Student(s2);//copy constructor
		
	}
}
