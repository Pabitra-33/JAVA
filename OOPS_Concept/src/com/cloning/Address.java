package com.cloning;

public class Address implements Cloneable {
	String city;
	String country;
	
	//parameterized constructor
	public Address(String city, String country) {
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();//calling the super class, i.e, Object class clone method
	}
}