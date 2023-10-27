package com.sunbeam;

import java.util.Scanner;

public class BinarySearh {
       
	   public static int binarySearch(int arr[],int size ,int key)
	   {
		   int comp=0;
		   int left=0;
		   int right=size-1;
		   int mid;
		   while(left<=right)
		   {
			    mid=(left+right)/2;
			   comp++;
			   if(arr[mid]==key)
			   {
				   return comp;
			   }
			   else
			   {
				   if(key<arr[mid])
				   {
					   right=mid-1;
				   }
				   else {
					   left=mid+1;
				   }
			   }
		   }
		   
		   return comp;
		   
	   }
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,30,40,50,60};
	
	     System.out.println("Enter key");
	     int key=sc.nextInt();
	     int com=binarySearch(arr,arr.length, key);
	     System.out.println("Total no of comparision is = "+com);

	}

}
