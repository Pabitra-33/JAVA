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
	
	//add method with index wise
	public void add(Object e, int index) {
		if(index <= -1 || index > size())
			throw new ArrayIndexOutOfBoundsException();
		
		if(count > arr.length)
			increase();
		for(int i=size()-1;i>=index;i--) {
			arr[i] = arr[i-1];
		}
	}

	//count of elements method
	private int size() {
		return count;
	}
}