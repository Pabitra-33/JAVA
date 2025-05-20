package com.encapsulation;

public class Person {
	// Private variable, only accessible within the class.
    private String name;
    private int age;   // Private variable

    // Getter method to access the name
    public String getName() {
        return name;
    }
    
    // Setter method to modify the name
    public void setName(String name) { 
        this.name = name;
    }

    public int getAge() { // Getter method to access the age
        return age;
    }

    public void setAge(int age) { // Setter method to modify the age
        if (age > 0) { // Validation can be added
            this.age = age;
        }
    }
}