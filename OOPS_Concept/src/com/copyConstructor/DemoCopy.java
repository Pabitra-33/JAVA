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
	
}
