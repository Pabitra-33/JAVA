package com.Inheritance.Multi_Level;

public class ParentChildRelationDriver {
	//main method
	public static void main(String[] args) {
		//creating parent class instance
		Parent p = new Parent(3, "Srija Land");
		p.getProperty();
		
		Child c = new Child(0, "Nuo Land");
		c.getProperty();
		
		GrandChild gc = new GrandChild(0, null);
		gc.getProperty();
	}
}
