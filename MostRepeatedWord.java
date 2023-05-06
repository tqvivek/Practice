package com.May5;

public class MostRepeatedWord {
	
	public static void countWord(String str)
	{
		 String[] word=str.split(" ");
		 
		 int count;
		 for(int i=0;i<word.length;i++)
		 {
			 count=1;
			 
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equals(word[j]))
				{
					count=count+1;
					word[j]="0";
				}
			}
			
			if(word[i]!="0")
			{
				System.out.println(word[i]+" "+count);
			}
		 }
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		String str="Race car is racing car of blue";
		
		countWord(str);

	}

}
