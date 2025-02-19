package com.Inheritance.Hierarchical;

//super class
class Company {
	void CompanyName() {
		System.out.println("Company name is Jspiders.");
	}
}

//first sub-class
class Employee1 extends Company {
	void EmployeeName1() {
		System.out.println("EmployeeName1 is Sakshi.");
	}
}

//second sub-class
class Employee2 extends Company {
	void EmployeeName2() {
		System.out.println("EmployeeName2 is Sourav.");
	}
}
//test class(implementation class) of the program
public class TestHierarchical {
	public static void main(String[] args) {
		//first sub-class object created
		Employee1 e1 = new Employee1();
		e1.CompanyName(); 
		e1.EmployeeName1(); 
		//second sub-class object created
		Employee2 e2 = new Employee2();
		e2.CompanyName(); 
		e2.EmployeeName2();
	}
}