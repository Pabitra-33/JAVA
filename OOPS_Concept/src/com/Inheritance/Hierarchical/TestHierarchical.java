package com.Inheritance.Hierarchical;

//Superclass
class Company {
	void CompanyName() {
		System.out.println("Company name is Dotnettricks.");
	}
}

//Subclass 1
class Employee1 extends Company {
	void EmployeeName1() {
		System.out.println("EmployeeName1 is Sakshi.");
}
}
//Subclass 2
class Employee2 extends Company {
void EmployeeName2() {
System.out.println("EmployeeName2 is Sourav.");
}
}
public class TestHierarchical {
	public static void main(String[] args) {
		 Employee1 E1 = new Employee1();
		 E1.CompanyName(); 
		 E1.EmployeeName1(); 
		 Employee2 E2 = new Employee2();
		 E2.CompanyName(); 
		 E2.EmployeeName2(); 
	}
}