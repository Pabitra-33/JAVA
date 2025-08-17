package com.LinearDS.DoubleLinkedList;

public class Node {
	Object ele;
	Node prev, next;
	
	//constructor one
	public Node(Object e) {
		ele = e;
		prev = null;
		next = null;
	}
	
	//constructor two
	public Node(Object e, Node p, Node n) {
		ele = e;
		prev = p;
		next = n;
	}
}