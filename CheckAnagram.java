package com.May5;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
	
	public static void isAnagram(String s1,String s2)
	{
		String str1=s1.replaceAll("\\s", " ");
		String str2=s2.replaceAll("\\s", " ");
		
		boolean status =true;
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Anagram");
		}
		
		else
		{
			
			char[] array1=s1.toLowerCase().toCharArray();
			char[] array2=s2.toLowerCase().toCharArray();
			
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			status=Arrays.equals(array1, array2);
			
			
			if(status)
			{
				System.out.println("Anagram");
			}
			else
				System.out.println("Not Anagram");
			
		}
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first String:");
		   String s1=sc.next();
		   
		   System.out.println("Enter the second String:");
		   String s2=sc.next();   
		   
		   
		   isAnagram( s1, s2);

		   
		
	}

}
