package com.InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class WordOccuranceUsingHashmap {
	public static void main(String[] args) {
		//given String
		String text = "Java is great and Java is powerful";

        // Convert to lower case and split by spaces
        String[] words = text.toLowerCase().split("\\s+");

        // HashMap to store word counts
        Map<String, Integer> wordCount = new HashMap<>();

        //calculating occurrences of words
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print word occurrences
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
	}
}