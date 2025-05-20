package com.impStringprogms;

import java.util.Scanner;

public class OccuranceOfWords {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Words: ");
		String word = scn.nextLine();
		
		//split the words
		String[] words = word.split(" ");
		
		//iterate the array
		for(int i = 0; i < words.length; i++) {
			int count = 1;//count variable
			if(words[i] == "") continue;
			for(int j = i+1; j < words.length; j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j] = "";//or make it null
				}
			}
			System.out.println(words[i]+" = "+count);
		}
		scn.close();
	}
}