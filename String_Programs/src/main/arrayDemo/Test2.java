package main.arrayDemo;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40};
		
		System.out.println(arr);//print the reference
		
		System.out.println("-------");//new line
		System.out.println(Arrays.toString(arr));//printing using toString method
		m1(arr);//calling the method
		System.out.println(Arrays.toString(arr));
	}
	
	//static method
	static void m1(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i]++;//increasing array each elements
		}
	}
}