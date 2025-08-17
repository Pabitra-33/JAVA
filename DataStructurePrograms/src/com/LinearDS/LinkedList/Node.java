package com.LinearDS.LinkedList;

//for creation of nodes we have taken a Node Class
public class Node {

	//it has two parts
	Object element;//the data user is giving
	Node next;//it should point to the next node or contains the next node address
	
	//constructor
	public Node(Object ele, Node nxt) {
		element = ele;
		next = nxt;
	}
}