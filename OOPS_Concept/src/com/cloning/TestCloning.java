package com.cloning;

class Demo implements Cloneable {
	int i;
	int j;
	
	//parameterized constructor
	public Demo(int i, int j) {
		this.i = i;
		this.j = j;
	}

	//toString method
	@Override
	public String toString() {
		return "Demo [i=" + i + ", j=" + j + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

//implementation class
public class TestCloning {
	public static void main(String[] args) {
		//first object created
		Demo d1 = new Demo(10, 30);
		
		//cloning the second object from the first object
		Demo d2 = null;
		try {
			d2 = (Demo)d1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("First Object : "+ d1);
		System.out.println("Second Object : "+ d2);
	}
}