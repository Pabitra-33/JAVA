package com.inheritance;

//Parent class
class Employee {
	int empId;
	String name;
	
	void displayInfo() {
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+name);
	}
}

//Child class that inherits from Employee
class FullTimeEmployee extends Employee {
	double salary;

	void displaySalary() {
		System.out.println("Salary: $" + salary);
    }
}

public class EmpDriverInheritance {
	public static void main(String[] args) {
		FullTimeEmployee emp = new FullTimeEmployee();
		emp.empId = 103;
		emp.name = "Madhava";
		emp.salary = 20345.00;
		
		emp.displayInfo();     // inherited method
        emp.displaySalary();   // own method
	}
}