package com.LinearDS.Stack;

import java.util.EmptyStackException;

public class ArrayStackProgram {
	
	//created an array
	private Object[] arr = new Object[6];
	
	//count variable to see how many elements we added
	private int count = 0;
	
	//methods for stack: push(), pop(), peek(), size(), isEmpty() etc.
	
	//first method : push()
	public void push(Object ele) {
		//call the increase method to increase size if the array is full.
		if(count > arr.length) {
			increase();
		}
		arr[count++] = ele;//and if space is there then add the element
	}

	//increase method to increase the size of the array, when it gets full
	private void increase() {
		Object[] temp = new Object[arr.length + 3];
		//copying the old elements to the newly created array
		for(int i =0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		//reassign the temp to the actual array name
		arr = temp;
	}
	
	//second method : size()
	public int size() {
		return count;
	}
	
	//third method : isEmpty()
	public boolean isEmpty() {
		return size() == 0;
	}
	
	
	//fourth method: pop()
	public Object pop() {
		//if it's empty then we need to throw an error
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		count--;
		Object e = arr[count];//storing the last element added to the stack,
		// in a temporary variable to show later
		arr[count] = null;//making that empty/null
		return e;// returning the deleted element
	}
	
	
	//fifth method: peek()
	public Object peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return arr[count-1];
	}
}