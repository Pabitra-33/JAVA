package com.stringprograms;

public class SumOfNumbersAsGroups {
	public static void main(String[] args) {
		String s1 = "a123b63";
		String s2 = "12bcd24";
		
		System.out.println("Sum of numbers as groups: "+ sumOfNumbers(s1));//186(123+63)
		System.out.println("Sum of numbers as groups: "+ sumOfNumbers(s2));//36(12+24)
	}
	
	public static int sumOfNumbers(String str) {
		int sum = 0;
		String num = "";
		
		for(char ch: str.toCharArray()) {
			if(Character.isDigit(ch)) {
				num += ch;//building the number
			}
			else {
				if(!num.isEmpty()) {
					sum += Integer.parseInt(num);//convert and add to sum
					num = "";//reset the number for further operation
				}
			}
		}
		
		//adding the last digit if String ends with a number
		if(!num.isEmpty()) {
			sum += Integer.parseInt(num);
		}
		
		return sum;
	}
}