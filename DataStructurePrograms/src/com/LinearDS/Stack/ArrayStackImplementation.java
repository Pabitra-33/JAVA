package com.LinearDS.Stack;

public class ArrayStackImplementation {
	public static void main(String[] args) {
		ArrayStackProgram asp = new ArrayStackProgram();
		asp.push(10);//adding the multiple elements
		asp.push(30);
		asp.push(60);
		asp.push(45);
		
		System.out.println("The size of stack is: "+asp.size());
		
		//removing the last added element in the stack
		System.out.println(asp.pop()); // 45
		
		System.out.println(asp.peek()); //60
	}
}