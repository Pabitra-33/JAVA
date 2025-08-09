package com.encapsulation;

//This class is to test encapsulated class "Employee".
public class EmployeeDriver {
	public static void main(String args[]) {
	    // Objects to Employee class
	    // First object - setting values using constructor
	    Employee emp = new Employee("Robert", "EMP001", 75450.00);

	    // Printing data
	    System.out.println("Employee (Intial Values):");
	    System.out.println(emp.getEmpId() + " , " + emp.getEmpName() + " , " + emp.getSalary());

	    // Updating values using setter methods
	    emp.setEmpName("Riyan");
	    emp.setEmpId("EMP002");
	    emp.setSalary(90500.00);

	    // Printing data
	    System.out.println("Employee (Updated Values):");
	    System.out.println(emp.getEmpId() + " , " + emp.getEmpName() + " , " + emp.getSalary());
	  }
}