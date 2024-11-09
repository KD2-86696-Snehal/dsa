package com.sunbeam.assign2_Q1;

import java.util.Arrays;

public class InsertionDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {30,10,80,20,90,40};
		
		System.out.println("Array="+Arrays.toString(arr));
		
		insertionSort(arr,arr.length);
		System.out.println("Array sorted in Descending order using insertion Sort="+Arrays.toString(arr));
		
	}

	private static void insertionSort(int[] arr, int length) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<length; i++)
		{
			int temp=arr[i];
			int j;
			for(j=i-1; j>=0 && temp>arr[j]; j-- )
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
		
	}

}
