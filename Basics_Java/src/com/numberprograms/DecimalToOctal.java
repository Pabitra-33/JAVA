package com.numberprograms;

public class DecimalToOctal {
	public static void main(String[] args) {
		//Printing the result of conversion  
 		System.out.println("Decimal of 21 octal is: "+getOctal(21));    
 		System.out.println("Decimal of 12 octal is: "+getOctal(12));    
 		System.out.println("Decimal of 9 octal is: "+getOctal(9));
	}

	private static String getOctal(int decimal) {
		String octal ="";//Declaring variable to store octal 
		
		//declaring array of octal numbers  
 	    char octalchars[]={'0','1','2','3','4','5','6','7'};  
 	    
 	    //writing logic of decimal to octal conversion   
 	    while(decimal>0){  
 	       int rem=decimal%8;   
 	       octal=octalchars[rem]+octal;   
 	       decimal=decimal/8;  
 	    }  
 	    return octal;
	}
}