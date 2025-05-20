package com.hasarelationships;

public class Tyre {
	//private variable/data member
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Tyre(String brand) {
		setBrand(brand);
	}
}