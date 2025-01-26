package com.ClassObject;

//Class Declaration
public class Dog {
	// Instance Variables
	String name;
	String breed;
	int age;
	String color;
	
	// Constructor Declaration of Class
	public Dog(String name, String breed, int age, String color)
	{
		this.name = name;
	    this.breed = breed;
	    this.age = age;
	    this.color = color;
	}
	
	// method 1
    public String getName() { 
	   return name; 
	}
    
    // method 2
    public String getBreed() { 
       return breed; 
    }

    // method 3
    public int getAge() { 
       return age; 
    }

    // method 4
    public String getColor() { 
       return color; 
    }

    @Override 
    public String toString()
    {
    	return ("Name is: " + this.getName()+ "\nBreed, age, and color are: " + this.getBreed() + "," + this.getAge()
             + "," + this.getColor());
    }
    
    //main method
    public static void main(String[] args)
    {
        Dog tuffy = new Dog("Tuffy", "Papillon", 5, "White");
        Dog retriever = new Dog("Retriever", "Papillon", 7, "Golden");
        
        System.out.println(tuffy.toString());
        System.out.println(retriever.toString());
    }
}
