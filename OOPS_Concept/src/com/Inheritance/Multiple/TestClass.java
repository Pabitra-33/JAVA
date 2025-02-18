package com.Inheritance.Multiple;

//Handling Diamond Problem in case of Default Methods
//Interface 1
interface GPU {
 // Default method to provide implementation in interface
 default void show(){
	 System.out.println("Default GPI");
	 }
}

//Interface 2 extending the above interface
interface PI1 extends GPU {
}

//Interface 3 extending the above interface
interface PI2 extends GPU {
}

//Implementation class code
public class TestClass implements PI1, PI2 {
 // Main driver method
	public static void main(String args[]){
     // Creating object of this class
     TestClass d = new TestClass();

     // Now calling the function defined in interface 1
     // from whom Interface 2and 3 are deriving
     d.show();
   }
}
