package com.basicprograms;

public class SumOfNoVarArgMethod {
	public static void main(String[] args) {
		System.out.println(sum(1,2));//3
		System.out.println(sum(10,20,30));//60
		System.out.println(sum(40,50,30));//120
		System.out.println(sum(121,22,35));//178
	}
	
	//sum() as a var-arg method
	public static int sum(int... j) {
		int sum = 0;
		//enhanced for-loop
		for(int eachNo : j) {
			sum += eachNo;
		}
		return sum;
	}
}
