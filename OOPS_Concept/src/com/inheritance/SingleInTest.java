package com.inheritance;

//Parent class
class One {
	public void print_Parent(){
     System.out.println("Parents are..");
 }
}

//child class
class Two extends One {
	public void print_Child() { 
		System.out.println("God");
	}
}

//Driver class
public class SingleInTest {
	// Main function
	public static void main(String[] args) {
		Two two = new Two();//creating object for child class
        two.print_Parent();//inherited method
        two.print_Child();//own method
    }
}
