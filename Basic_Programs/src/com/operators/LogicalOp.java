package com.operators;

public class LogicalOp {

	public static void main(String[] args) 
	{
		int a = 7;
		int b = 8;
		//AND Operator
		System.out.println(a>b && b<a);//false
		
		//OR operator
		System.out.println(a>b || b>a);//true
		
		//Not operator
		int k = 0;
		System.out.println(!(k==0));
	}

}
