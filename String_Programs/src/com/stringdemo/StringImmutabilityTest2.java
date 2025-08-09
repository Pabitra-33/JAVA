package com.stringdemo;

public class StringImmutabilityTest2 {
	public static void main(String[] args) {
		String name = "Sachin";
		//appending Tendulkar to the existing string "Sachin" 
        String name1 = name.concat(" Tendulkar");//Sachin Tendulkar
        
        System.out.println(name);//Sachin
        System.out.println(name1);//Sachin Tendulkar
	}
}