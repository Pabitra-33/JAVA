package com.inheritance;

//Base or Super Class
class Employees {
	int salary = 60000;
}

//Inherited or Sub Class
class Engineer extends Employees {
	int benefits = 10000;
}

//Driver Class
public class TestDriver {
	public static void main(String args[]) {
		Engineer e1 = new Engineer();
        System.out.println("Salary : " + e1.salary+ "\nBenefits : " + e1.benefits);
 }
}