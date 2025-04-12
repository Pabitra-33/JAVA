package com.encapsulation;

//Class "Employee"
public class Employee {
	private String emp_name;
	private String emp_id;
	private double net_salary;
	
	// Constructor
	public Employee(String emp_name, String emp_id, double net_salary) {
		this.emp_name = emp_name;
	    this.emp_id = emp_id;
	    this.net_salary = net_salary;
	}
	
	// Getter methods
	public String getEmpName() {
	 return emp_name;
	}

	public String getEmpId() {
	 return emp_id;
	}

	public double getSalary() {
	 return net_salary;
	}
	
	// Setter methods
	public void setEmpName(String emp_name) {
	 this.emp_name = emp_name;
	}

	public void setEmpId(String emp_id) {
	 this.emp_id = emp_id;
	}

	public void setSalary(double net_salary) {
	 this.net_salary = net_salary;
	}
}