package com.classesAndobjects;

public class MobileDriver {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.name = "Oppo";
		m1.color = "Black";
		m1.ram = 4;
		m1.rom = 128;
		m1.price = 15000.00;
		//printing details
		System.out.println(m1.name+"\n"+m1.color+"\n"+m1.ram+"\n"+m1.rom+"\n"+m1.price);
		m1.calling();
		m1.texting();
		System.out.println("--------------");
		
		//creating second object
		Mobile m2 = new Mobile();
		m2.name = "Vivo";
		m2.color = "White";
		m2.ram = 6;
		m2.rom = 256;
		m2.price = 20000.00;
		//printing details
		System.out.println(m2.name+"\n"+m2.color+"\n"+m2.ram+"\n"+m2.rom+"\n"+m2.price);
		m2.calling();
		m2.texting();
	}
}