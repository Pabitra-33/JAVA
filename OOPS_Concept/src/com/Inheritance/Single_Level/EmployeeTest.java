package com.Inheritance.Single_Level;

//Base or Super Class
class Employee {
 int salary = 60000;
}

//Inherited or Sub Class
class Engineer extends Employee {
 int benefits = 10000;
}

//Driver Class
public class EmployeeTest {
 public static void main(String args[])
 {
     Engineer E1 = new Engineer();
     System.out.println("Salary : " + E1.salary
                        + "\nBenefits : " + E1.benefits);
 }
}