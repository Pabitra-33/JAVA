package com.copyConstructor;


public class DemoCopy {
	int i;
	int j;
	
	public DemoCopy(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public DemoCopy(DemoCopy d) {
		this.i = d.i;
		this.j = d.j;
	}
	
	//main method
	public static void main(String[] args) {
		DemoCopy d1 = new DemoCopy(100,200);
		DemoCopy d2 = new DemoCopy(d1);//copy constructor
		
		System.out.println(d1.i+" , "+d1.j);
		System.out.println(d2.i+" , "+d2.j);
	}
}
