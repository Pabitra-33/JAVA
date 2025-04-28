package com.methodimplementations;

public class ObjectBasedMethodImplementation {
	int i;
	static int j;
	
	//increment method
	void increment() {
		i++;
		j++;
	}
	
	//display method
	void display() {
		System.out.println(i+" "+j);
	}
	
	//main method
	public static void main(String[] args) {
		ObjectBasedMethodImplementation o1 = new ObjectBasedMethodImplementation();
		ObjectBasedMethodImplementation o2 = new ObjectBasedMethodImplementation();
		ObjectBasedMethodImplementation o3 = new ObjectBasedMethodImplementation();
		
		o1.increment();//1
 		o2.increment();//1
 		o3.increment();//1
 		
 		//display the values
 		o1.display();//1 3
 		o2.display();//1 3
 		o3.display();//1 3
 		
 		System.out.println("----\n----");
 		
 		//calling the increment method for the same instance
 		o1.increment();//1
 		o1.increment();//2
 		o1.increment();//3
 		
 		o1.display();//3 3
 		o2.display();//0 3
 		o3.display();//0 3
	}
}