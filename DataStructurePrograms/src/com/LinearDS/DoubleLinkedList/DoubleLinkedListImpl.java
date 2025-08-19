package com.LinearDS.DoubleLinkedList;

public class DoubleLinkedListImpl {
	private Node first = null;
	private int count = 0;
	
	//adding a new node
	public void add(Object e) {
		if(first == null) {
			first = new Node(e, null, null);
			count++;
			return;
		}
		//if there is element present to add we need
		//to traverse till the end and add new node.
		Node curr = first;
		
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = new Node(e, curr, null);
		count++;
	}
}