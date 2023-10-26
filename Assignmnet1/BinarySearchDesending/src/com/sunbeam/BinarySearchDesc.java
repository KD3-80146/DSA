package com.sunbeam;

import java.util.Scanner;

public class BinarySearchDesc {

	public static int BinarySearch(int[]arr,int size,int key)
	{
		int left=size-1;
		int right=0;
		int mid;
		int count=0;
		while(right<=left)
		{
			mid=(left+right)/2;
			
			if(arr[mid]==key)
			{
				count++;
			   return count;
			}
			else {
			if(arr[mid]>key)
			{
				right=mid+1;
			}
			else
			{
				left=mid-1;
			}
			}	
			
		}
		return count;
	}
	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
			int arr[]= {40,30,20,10};
		
		     System.out.println("Enter key");
		     int key=sc.nextInt();
		     int com=BinarySearch(arr,arr.length, key);
		     if(com==0)
		     {
		    	 System.out.println("Element not found");
		    	 
		     }
		     else {
		    	 System.out.println("Element found");
		     }
		    

	}

}
