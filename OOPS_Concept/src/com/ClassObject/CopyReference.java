package com.ClassObject;

public class CopyReference {
	int i;
	int j;
	
	public static void main(String[] args) {
		CopyReference c1 = new CopyReference();
		CopyReference c2 = c1; //copying reference
		c1.i = 10;
		c1.j = 20;
		c2.j = 30;
		System.out.println(c1.i+" , "+c1.j);
		System.out.println(c2.i+" , "+c2.j);
	}
}
