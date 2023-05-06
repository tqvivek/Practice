package com.May5;

import java.util.Arrays;

public class ReverseArray {
	
	public static void reverseArray(int[] arr)
	{
		
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
			left++;
			right--;
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Original Array:"+Arrays.toString(arr));
		
		reverseArray(arr);
		
		System.out.println("Reverse Array:"+Arrays.toString(arr));
	}

}
