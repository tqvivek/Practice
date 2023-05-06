package com.May5;

import java.util.Arrays;

public class MostRepWord {
	
	public static void mostRepWord(String str)
	{
		
		 String[] words = str.split("\\s+");

	        Arrays.sort(words);

	        int maxCount = 1;
	        
	        int currentCount = 1;
	        
	        String mostRepeatedWord = words[0];

	        for (int i = 1; i < words.length; i++) 
	        {
	            if (words[i].equals(words[i - 1])) 
	            {
	                currentCount++;
	            } else {
	                currentCount = 1;
	            }

	            if (currentCount > maxCount) {
	                maxCount = currentCount;
	                mostRepeatedWord = words[i];
	            }
	        }

	        System.out.println("Most repeated word: " + mostRepeatedWord);
	        System.out.println("Frequency: " + maxCount);
	    }
		
	
	public static void main(String[] args) {
		
		String s="Race car is racing car is blue.";
		
		mostRepWord(s);
	}

}
