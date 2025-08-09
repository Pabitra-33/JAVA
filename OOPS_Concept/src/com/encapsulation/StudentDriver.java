package com.encapsulation;

public class StudentDriver {
    public static void main(String[] args) {
        Student stu = new Student();
        
        // Using setter methods
        stu.setName("John Doe");
        stu.setAge(30);
        stu.setSalary(50000.0);
        
        // Using getter methods
        System.out.println("Name: " + stu.getName());
        System.out.println("Age: " + stu.getAge());
        System.out.println("Salary: " + stu.getSalary());
    }
}