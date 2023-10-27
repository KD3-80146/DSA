package com.sunbeam;

import java.util.Arrays;

public class SelectionSort {
	 public static int selectionSort(int []arr,int size) {
		  int count=0;
		  boolean flag=false;
		 for(int i=0;i<size-1;i++)
		 {
			 for(int j=i+1;j<size;j++)
			 {
				 count++;
				 if(arr[i]>arr[j])
				 {
					 int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
					 flag=true;
					 
				 }
			 }
			 if(flag==false)
			 {
				 return count;
			 }
		 }
		 return count;
	 }

	public static void main(String[] args) {
		 
		//int arr[]= {70,10,5,4,3,1};
		int arr[]= {10,20,30,40};
		System.out.println("array before sort"+Arrays.toString(arr));
		int cout=selectionSort(arr,arr.length);
		System.out.println("Total no of comparision = "+cout);
		System.out.println("array After sort"+Arrays.toString(arr));
	 

	}

}
