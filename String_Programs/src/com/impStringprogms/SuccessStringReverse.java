package com.impStringprogms;

public class SuccessStringReverse {
	public static void main(String[] args) {
		String word = "success";//output: cuscsse
		String rev = "";

		int st = 0, end = word.length()-1;
		int mid = (st+end)/2;
		for(int i=mid-1; i>=0; i--) {
			rev += word.charAt(i);
		}
		rev += word.charAt(mid);
		for(int j= word.length()-1; j>=mid+1; j--) {
			rev += word.charAt(j);
		}
		System.out.println("After reverse: "+rev);
	}
}