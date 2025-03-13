package com.blocks.MultiLineInitializer;

public class Non_staticBlock {
	//static data members
	static int r;
	int k;
	int j;
		
	//non-static block
	{
		//non-static blocks are used to initialize both static and non-static data members.
		Non_staticBlock.r = 10;
		k = 30;
		j = 60;
	}
		
	public static void main(String[] args) {
		System.out.println("Main Starts");
		
		Non_staticBlock nb = new Non_staticBlock();
		System.out.println(Non_staticBlock.r);//static data member printed
		System.out.println(nb.k);//non-static data member printed
		System.out.println(nb.j);
		
		System.out.println("Main Ends");
	}
}
