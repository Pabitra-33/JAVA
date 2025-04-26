package com.cloning;

class Demo implements Cloneable {
	int i;
	int j;
	
	//constructor
	public Demo(int i, int j) {
		this.i = i;
		this.j = j;
	}

	//toString method
	@Override
	public String toString() {
		return "Demo [i=" + i + ", j=" + j + "]";
	}
	
}
public class TestCloning {

}
