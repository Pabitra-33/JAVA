package com.numberprograms;
import java.util.* ; 

public class PowerOfNumber {
	//main
	public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter base(x)");
	        int x=sc.nextInt();
	        System.out.print("Enter power(n)");
	        int n=sc.nextInt();

	        int result=1;
	        for(int i=1;i<=n;i++){
	            result *= x;
	        }
	        System.out.println(result);
	        sc.close();
	}
}