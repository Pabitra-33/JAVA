package com.basic_progms;

public class OctalToDecimal {
	public static void main(String[] args) {
		//Printing the result of conversion  
		System.out.println("Decimal of 021 octal is: "+getDecimal(021));    
		System.out.println("Decimal of 23 octal is: "+getDecimal(23));    
		System.out.println("Decimal of 10 octal is: "+getDecimal(10));
	}

	private static int getDecimal(int octal) {
		//Declaring variable to store decimal number  
		int decimal = 0;
		//Declaring variable to use in power  
	    int n = 0;    
	    //writing logic   
	    while(true){    
	      if(octal == 0){    
	        break;    
	      }
	      else 
	      {
	    	  int temp = octal%10;//getting last digit  
	          decimal += temp*Math.pow(8, n);   //converting to decimal 
	          octal = octal/10;    //removing the last element
	          n++;
	      }
	    }
		return decimal;
	}
}
