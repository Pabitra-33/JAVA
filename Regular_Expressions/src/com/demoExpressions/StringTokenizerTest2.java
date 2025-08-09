package com.demoExpressions;

import java.util.StringTokenizer;

public class StringTokenizerTest2 {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("1,99,988", ",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken()); //1
			                                   //99
			                                   //988
		}
	}
}