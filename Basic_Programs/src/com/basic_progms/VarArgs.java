package com.basic_progms;

public class VarArgs {
	//var-Args used to helps us passing any no of arguments to a method and it should accept and perform operation.
	public static void main(String[] args) {
		varMain(2);//calling by one actual argument
		varMain(3,5);//calling by two actual arguments
		varMain(4,6,9);//calling by three actual arguments
		varMain(2,5,7,9,4);//calling by five actual arguments
	}
	
	public static void varMain(int... a)//var-args can accept any no of arguments
	{
		//for-each loop
		for(int e:a) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
}
