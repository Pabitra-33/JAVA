package com.LinearDS.LinkedList;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedListImplementation implementation = new LinkedListImplementation();
		implementation.add(10);
		implementation.add(20);
		implementation.add(30);
		implementation.add(50);
		implementation.add(70);
		
		//adding element node in between the linked list
		implementation.add(40, 0);//adding in the first
		
		//adding in between linked list
		implementation.add(80, 3);
		
		//getting all the elements
		for(int i=0; i<implementation.size(); i++) {
			System.out.print(implementation.get(i));
		}
		
		implementation.remove(2);//removing the index 2 element
	}
}