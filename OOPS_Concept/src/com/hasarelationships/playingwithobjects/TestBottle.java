package com.hasarelationships.playingwithobjects;

public class TestBottle {
	public static void main(String[] args) {
		Bottle b = new Bottle();
		//b.setBrand("Bisleri").setCost(30);//method chaining
		b.setBrand("Bisleri");
		b.setCost(30);
		
		System.out.println("Bottle Brand: "+b.getBrand());
		System.out.println("Bottle Price: "+b.getCost());
	}
}