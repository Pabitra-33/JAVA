package com.demoExpressions;

import java.util.*; 

public class StringTokenizerTest {
	public static void main(String[] args) { 
		StringTokenizer st = new StringTokenizer("sai software solutions");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());//sai 
                                              //software 
                                             //solutions 
		}
	}
}