package com.Inheritance.Single_Level;

class Doctor {
	  // method in the superclass
	  public void operate() {
	    System.out.println("I can do Operation");
	  }
	}

	// Dog inherits Animal
	class Surgeon extends Doctor {

	  // overriding the eat() method
	  @Override
	  public void operate() {
	    // call method of superclass
	    super.operate();
	    System.out.println("I can operate evrything");
	  }

	  // new method in subclass
	  public void surgery() {
	    System.out.println("I can do Surgery");
	  }
	}

public	class SuperKeywordInheritance {
	  public static void main(String[] args) {

	    // create an object of the subclass
		Surgeon s1 = new Surgeon();

	    // call the eat() method
	    s1.operate();
	    s1.surgery();
	  }
	}