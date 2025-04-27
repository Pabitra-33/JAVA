package com.cloning;

public class PersonDriver {
	public static void main(String[] args) throws CloneNotSupportedException {
		//created a person object
		Person p1 = new Person("Ram", 27, 9874436210l, new Address("Bengaluru", "India"));
		
		//cloning a new object from the existing one
		Person p2 = (Person) p1.clone();//throws CloneNotSupportedException
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("===========");
		
		//setting the city for object two
		p2.address.city = "Hyderabad";
		System.out.println(p1);
		System.out.println(p2);
	}
}