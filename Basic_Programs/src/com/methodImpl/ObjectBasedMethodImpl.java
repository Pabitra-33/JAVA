package com.methodImpl;

public class ObjectBasedMethodImpl {
	int i;
	static int j;
	
	//Increment method
	void increment() {
		i++;
		j++;
	}
	
	//display method
	void display() {
		System.out.println(i+" "+j);
	}
	
	public static void main(String[] args) {
		ObjectBasedMethodImpl o1 = new ObjectBasedMethodImpl();
		ObjectBasedMethodImpl o2 = new ObjectBasedMethodImpl();
		ObjectBasedMethodImpl o3 = new ObjectBasedMethodImpl();
		
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
