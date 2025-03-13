package com.FactoryMethod.singelTonClass;

class Database {
	   private static Database dbObject;
	   
	   //we are restricting the creation of instances by making it private
	   private Database() {      
	   }

	   public static Database getInstance() {
	      // create object if it's not already created
	      if(dbObject == null) {
	         dbObject = new Database();
	      }
	       // returns the singleton object
	       return dbObject;
	   }

	   public void getConnection() {
	       System.out.println("You are now connected to the database.");
	   }
}

public class SingleTonTest {
	public static void main(String[] args) {
		// refers to the only object of Database
		Database db1= Database.getInstance();
	    db1.getConnection();
	}
}