package com.Literals;

public class FloatingPointLiteral {
	public static void main(String[] args) {
		float k = 30.21f; //defined a floating point value
		//float f = 12.34; //converting the double type to float, so Compile Time Error: incompatible types: possible lossy conversion from double to float.
		System.out.println("Float value of k= "+k);//30.21
		
		//explicitly defining the double type value
		double d = 12.30;//valid
		double c = 012.34;//valid
		//double f = 0x12.34; //Invalid CE: malformed floating point.
		System.out.println("Value of d= "+d);//12.3
		System.out.println("Value of c= "+c);//12.34
	}
}
