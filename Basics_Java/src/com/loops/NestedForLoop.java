package com.loops;

public class NestedForLoop {
	public static void main(String[] args) {
		//outer loop
		for(int i=0; i<=5; i++) {
			//inner loop
			for(int j=0; j<=5; j++) {
				System.out.println(i+" "+j);
			}
		}
	}
}