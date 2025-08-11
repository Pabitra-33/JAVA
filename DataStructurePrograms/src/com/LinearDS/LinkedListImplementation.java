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
}