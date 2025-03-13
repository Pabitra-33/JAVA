package com.basic_progms;

public class SumOfNoArgInMethod {

	public static void main(String[] args) {
		System.out.println(sum(10,30));//40
		System.out.println(sum(30,50,80));//160
		System.out.println(sum(10,40,60,90));//200
		System.out.println(sum(20,30,40,65,78));//233
	}
	//adding any number of arguments with the help of var-Args
	public static int sum(int... nums)
	{
		int sum = 0;
		//for-Each loop
		for(int eachNo: nums) {
			sum += eachNo;
		}
		return sum;
	}
}
