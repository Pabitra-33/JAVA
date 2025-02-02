package com.FactoryMethod;

import java.util.Scanner;

public class Vehicle {
	String name;
	int vNo;
	
	//constructor
	public Vehicle(String name, int vNo) {
		this.name = name;
		this.vNo = vNo;
	}
	
	//factory method
	public static Vehicle getInstance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vehicle name: ");
		String vName = sc.next();
		System.out.println("Enter vehicle number: ");
		int vNum = sc.nextInt();
		return new Vehicle(vName, vNum);
		
	}
	
	//main method
	public static void main(String[] args) {
		Vehicle v1 = getInstance();
		Vehicle v2 = getInstance();
		Vehicle v3 = getInstance();
		
		System.out.println(v1.name+"\n"+v1.vNo+"\n");
		System.out.println(v2.name+"\n"+v1.vNo+"\n");
		System.out.println(v3.name+"\n"+v1.vNo);
	}
}
