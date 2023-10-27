package com.sunbeam;

import java.util.Arrays;

public class BubbleSort {
	public static int bubbleSort(int []arr,int size)
	{
		int comp=0;
		boolean flag=false;
		 for(int i=0;i<size-1;i++)
		 {
			 for(int j=0;j<size-i-1;j++)
			 {
				 comp++;
				 if(arr[j]>arr[j+1])
				 {
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					 flag=true;
				 }
			 }
			 if(flag==false)
			 {
				 return comp;
			 }
		 }
		 return comp;
	}
	
	public static void main(String[] args)
	{
		
		int arr[]= {90,40,50,10};
		//int arr[]= {10,20,30,40};
		System.out.println("Before sort arr is = "+Arrays.toString(arr));
		int comp=bubbleSort(arr,arr.length);
		System.out.println("Total no of Comparision is = "+comp);
		System.out.println("After sort arr is = "+Arrays.toString(arr));
		
	}

}
