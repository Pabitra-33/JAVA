package com.ClassObject;

public class StudentDriver {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.insti = "JSP";
		s1.name = "Ramana";
		s1.age = 25;
		s1.id = 1;
		s1.mobile = 9564327691l;
		
		Student s2 = new Student();
		s2.insti = "QSP";
		s2.name = "Kavya";
		s2.age = 23;
		s2.id = 3;
		s2.mobile = 8534327691l;
		
		//displaying data
		s1.display();
		System.out.println("==========");
		s2.display();
	}
}
