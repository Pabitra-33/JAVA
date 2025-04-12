package com.encapsulation;

//creating a encapsulated class that contains only the private data members
//and public member functions to initialize them
class PureEncapsulatedClass {
	private int i;//outside this class we can not access
	private int j;
	private int k;
	
	//getter and setter method
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	
}

//implementation class
public class Test {
	public static void main(String[] args) {
		//creating the object of the encapsulated class to access the properties
		PureEncapsulatedClass encap = new PureEncapsulatedClass();
		int val1 = encap.getI();//default value assigned
		System.out.println(val1);//0
		encap.setI(10);
		encap.setJ(30);
		encap.setK(60);
		System.out.println("Value of i= "+encap.getI());//10
		System.out.println("Value of j= "+encap.getJ());//30
		System.out.println("Value of k= "+encap.getK());//60
	}
}