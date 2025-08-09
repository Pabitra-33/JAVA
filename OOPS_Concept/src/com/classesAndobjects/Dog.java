package com.classesAndobjects;

public class Dog {
	// Instance Variables
	String name;
	String breed;
	int age;
	String color;
	
	//constructor
	public Dog(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	//getter methods
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + ", color=" + color + "]";
	}
	
	//main method
    public static void main(String[] args) {
        Dog tuffy = new Dog("Tuffy", "Papillon", 5, "White");
        Dog retriever = new Dog("Retriever", "Papillon", 7, "Golden");
        
        System.out.println(tuffy.toString());
        System.out.println(retriever.toString());
    }
}