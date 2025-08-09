package com.encapsulation;

public class PersonDriver {
	public static void main(String[] args) {
		//creating an instance of the encapsulated class person
		Person person = new Person();
		
		//setting value of the name member
		person.setName("Arjuna");
		//setting the value of the age member
		person.setAge(20);
		
		//getting value of the name and age member using getter method
		System.out.println("Name is: "+person.getName());//Arjuna
		System.out.println("Age is: "+person.getAge());//20
	}
}