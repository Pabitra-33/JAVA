package com.Encapsulation;

class Employee {
	private int empId;
	private String eName;
	
	//Setter method
	public void set_id(int empId) {
		this.empId = empId;
	}
	public void set_name(String eName) {
		this.eName = eName;
	}
	
	//Getter method
	public int get_Id() {
		return empId;
	}
	public String get_Name() {
		return eName;
	}
}
public class EmployeeDriver {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.set_id(30);
		employee.set_name("Raghava");
		
		System.out.println("Employee id: " + employee.get_Id());
        System.out.println("Employee Name: " + employee.get_Name());
	}
}
