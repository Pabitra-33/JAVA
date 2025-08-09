package com.LinearDS;

public class ArrayListImplementation {
	Object[] arr = new Object[5];
	int count = 0;
	
	// add method
	public void add(Object ele) {
		if(count > arr.length)
			increase();
		arr[count] = ele;
		count++; //added a element, so increase count.
	}

	//increase method
	private void increase() {
		Object[] temp = new Object[arr.length + 3];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];//copying all the elements from the array to temporary array
		}
		arr = temp;
	}
	
	
}