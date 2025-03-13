package com.Literals;

public class Test1 {
	public static void main(String[] args) 
	{
		//writing  a long type value in integer type
		long a = 10L; //valid
		//int l = 20L; //Compile Time Error: incompatible types: possible lossy conversion from long to int.
		System.out.println("Value of a= "+a);
		
		//writing  a byte type value in integer type
		byte b = 10; //valid
		byte c = 127; //valid
		//byte d = 129; //byte range exceed, so Compile Time Error: incompatible types: possible lossy conversion from int to byte.
		System.out.println("Value of b= "+b);
		System.out.println("Value of c= "+c);
		
		//writing  a short type value in integer type
		short s = 32767; //valid
		//short p = 32769; //in-valid, short range exceed, so Compile Time Error: incompatible types: possible lossy conversion from int to short.
		System.out.println("Value of s= "+s);
	}
}
