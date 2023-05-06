package com.May5;

public class SumOfDigitInString {
	
	public static void countSumOfDigit(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
			{
				sum=sum+Character.getNumericValue(ch);
			}
		}
		System.out.println(sum);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		String str="g213m7";
		
		countSumOfDigit("Sum Of Digit In String is:"+str);

	}

}
