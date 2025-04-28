package com.cloning;

import java.util.HashMap;
import java.util.Map;

public class EmployeeCloningTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee emp = new Employee();//calling the default constructor
		//using the setter methods we are assigning the value
		emp.setId(300);
		emp.setName("Keshava");
		
		//creating the Hashmap to add data for the properties
		Map<String, String> map = new HashMap<String, String>();
		map.put("Salary", "30000");//adding the value for the hashmap
		map.put("City", "Bangalore");
		
		//now assign the map reference to the setter method
		emp.setProperties(map);
		
		//create another object by using the first created object, using the clone() method
		Employee clonedEmp = (Employee) emp.clone();//propagating the exception in main method
		
		// Check whether the emp and clonedEmp attributes are same or different
		System.out.println("emp and clonedEmp == test: " + (emp == clonedEmp));
				
		System.out.println("emp and clonedEmp HashMap == test: " + (emp.getProperties() == clonedEmp.getProperties()));	
		
		// Let's see the effect of using default cloning
		
		// change emp props
		emp.getProperties().put("title", "CEO");
		emp.getProperties().put("city", "New York");
		System.out.println("clonedEmp props:" + clonedEmp.getProperties());

		// change emp name
		emp.setName("Madhava");
		System.out.println("clonedEmp name:" + clonedEmp.getName());

	}
}