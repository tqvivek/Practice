package com.May5;

import java.util.Arrays;

public class MergedTwoArray {
	
	public static void mergeTwoArray(int[] arr1,int[] arr2)
	{
		
		  int[] result = new int[arr1.length + arr2.length];
		  
	        int i = 0, j = 0, k = 0;
	        
	        while (i < arr1.length && j < arr2.length)
	        {
	            result[k++] = arr1[i++];
	            result[k++] = arr2[j++];
	        }
	        while (i < arr1.length) {
	            result[k++] = arr1[i++];
	        }
	        
	        System.out.println(Arrays.toString(result));
	        //return result;
	       
	    }
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,4,5,6,7};
		int[] arr2= {11,12,13,14};
		
		mergeTwoArray(arr1,arr2);
		
		
		
	
		
		
	}

}
