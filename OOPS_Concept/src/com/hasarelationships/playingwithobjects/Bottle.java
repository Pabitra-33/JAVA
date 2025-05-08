package com.hasarelationships.playingwithobjects;

public class Bottle {
	//private data members
	private String brand;
	private int cost;
	
	//getters and setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	//non-parameterized constructor
	public Bottle() {
		
	}
	
	//parameterized constructor
	public Bottle(String brand, int cost) {
		this.brand = brand;
		this.cost = cost;
	}
}