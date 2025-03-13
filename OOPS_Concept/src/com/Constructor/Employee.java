package com.Constructor;

public class Employee {
	String eName;
	int empId;
	int age;
	
	//parameterized constructor
	public Employee(String eName, int empId, int age) {
		this.eName = eName;
		this.empId = empId;
		this.age = age;
	}

	//display entered data
	public void display() {
		System.out.println(eName+"\n"+empId+"\n"+age);
	}
	
	//main method
	public static void main(String[] args) {
		Employee e1 = new Employee("Kavya", 1, 23);
		Employee e2 = new Employee("Amaran", 1, 23);
		Employee e3 = new Employee("Kabiraj", 3, 23);
		e1.display();
		System.out.println("=========");
		e2.display();
		System.out.println("=========");
		e3.display();
	}
}
