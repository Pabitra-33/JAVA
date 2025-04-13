package com.encapsulation;

public class Student {
    // Private variables - hidden from other classes
    private String name;
    private int age;
    private double salary;
    
    // Public getter methods to read the values
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getSalary() {
        return salary;
    }
    
    // Public setter methods to modify the values (with validation)
    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    
    public void setAge(int age) {
        if(age > 0 && age < 120) {
            this.age = age;
        }
    }
    
    public void setSalary(double salary) {
        if(salary >= 0) {
            this.salary = salary;
        }
    }
}