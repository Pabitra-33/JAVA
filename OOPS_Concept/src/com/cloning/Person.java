package com.cloning;

public class Person implements Cloneable {
	String name;
	int age;
	long mobileno;
	
	Address address;//Has-a relationship

	//parameterized constructor
	public Person(String name, int age, long mobileno, Address address) {
		this.name = name;
		this.age = age;
		this.mobileno = mobileno;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", mobileno=" + mobileno + ", address=" + address + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();//calling the super class, i.e, Object class clone method
	}
}