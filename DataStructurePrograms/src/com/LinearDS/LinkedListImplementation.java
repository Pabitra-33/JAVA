package com.LinearDS;

//to provide implementation taken a implementation class
public class LinkedListImplementation {
	private Node first = null;//aggregation
	private int count = 0;//for node counting purpose
	
	//adding a node
	public void add(Object ele) {
		//if the first is null then create a new node and assign to it
		if(first == null) {
			first = new Node(ele, null);
			count++;//increasing count as we added a node.
			return;
		}
		
		//if the first is not null, then traverse till the end and add a new node
		Node curr = first;//taking a temporary variable to traverse till end and add
		while(curr.next != null) {
			curr = curr.next;//by this end of the loop we will reach the end.
		}
		
		curr.next = new Node(ele, null);//storing the new node in the curr.next position to make a chain
		count++;
	}
	
	//size method
	public int size() {
		return count;
	}
	
	//adding element in the first or in between
	public void add(Object ele, int index) {
		if(index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		
		//adding a new node on the 0th index
		if(index == 0) {
			first = new Node(ele, first);
			count++;
			return;
		}
		
		//adding a node in between the linked list
		Node curr = first;
		for(int i =1; i<index; i++) {
			curr = curr.next;//traversing till that previous position to add
		}
		curr.next = new Node(ele, curr.next);
		count++;
	}
	
}