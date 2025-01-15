package com.starPattern;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

        System.out.println("Enter no of line: ");
        int lines = scn.nextInt();

        int spaces = lines/2;
        int stars = 1;

        for(int i=1; i<= lines; i++)//for no of lines
        {
            for(int j=1; j<=spaces; j++)//for spaces
            {
                System.out.print(" ");
            }
            for(int j=1; j<= stars; j++)//for stars
            {
                System.out.print("*");
            }
            System.out.println();
            if(i<=lines/2)
            {
                spaces--;
                stars+=2;
            }
            else{
                spaces++;
                stars-=2;
            }
        }
	}
}
