package com.blocks.MultiLineInitializer;

public class StaticBlock 
{
	//static data members
	static int k;
	static int j;
	
	//static block
	static 
	{
		//static blocks are used to initialize static data members only.
		k = 30;
		j = 60;
	}
	
	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println(StaticBlock.j);
		System.out.println(StaticBlock.k);
		System.out.println("Main Ends");
	}
}
