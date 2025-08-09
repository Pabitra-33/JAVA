package com.PatternPrograms;

import java.util.Scanner;

public class HollowDiamondPattern {
	public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a line: ");
        int lines = scn.nextInt();

        int spaces = lines/2;
        int stars = 1;

        //for no of lines
        for(int i=1; i<= lines; i++) {
        	//for spaces
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<= stars; j++) {
                if(j==1 || j==stars) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            if(i<=lines/2) {
                spaces--;
                stars+=2;
            }
            else{
                spaces++;
                stars-=2;
            }
        }
        scn.close();
    }
}