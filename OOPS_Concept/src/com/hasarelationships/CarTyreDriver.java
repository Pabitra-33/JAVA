package com.hasarelationships;

public class CarTyreDriver {
	public static void main(String[] args) {
		Car c=new Car();//car object
		for (int i = 0; i <c.getTyres().length; i++) {
			System.out.println(c.getTyres()[i].getBrand());
		}
	}
}