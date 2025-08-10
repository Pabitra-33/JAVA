package com.LinearDS;

public class ArrayListImplementation {
	private Object[] arr = new Object[5];
	private int count = 0;
	
	// add method
	public void add(Object ele) {
		if(count >= arr.length)
			increase();
		arr[count] = ele; //or arr[count++] = ele;
		count++; //added a element, so increase count.
	}

	//increase method
	private void increase() {
		Object[] temp = new Object[arr.length + 3];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];//copying all the elements from the array to temporary array
		}
		arr = temp;//again changing the temporary array name to arr
	}
	
	//count of elements method
	private int size() {
		return count;
	}
	
	//add method with index wise
	public void add(Object e, int index) {
		if(index <= -1 || index >= size())
			throw new ArrayIndexOutOfBoundsException();
		
		if(count >= arr.length)
			increase();//calling increase method for full of array list
		
		for(int i=size()-1;i>=index;i--) {
			arr[i+1] = arr[i];//storing the previous element in the next box to make it empty
		}
	}
	
	//get the object method
	public Object get(int index) {
		if(index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		return arr[index];
	}
	
	
	//removing element from an array list by index number
	public void remove(int index) {
		if(index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		
		//traverse till the index next element
		for(int i=index+1; i<size(); i++) {
			arr[i-1] = arr[i];
		}
		count--;
		arr[count] = null;
	}
}