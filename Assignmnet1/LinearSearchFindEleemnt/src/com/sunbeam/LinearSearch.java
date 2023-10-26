package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {
	 public static int findElement(int[]arr,int size,int key)
	 {
		 
		  for(int i=0;i<size;i++)
		  {
			  if(arr[i]==key)
			  {
				 
				  return i;
			  }
		  }
		  return -1;
	 }

	public static void main(String[] args) {
		  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key");
		int arr[]= {10,20,30,40};
		int key=sc.nextInt();
		int com=findElement(arr, arr.length, key);
		 if(com==-1)
		System.out.println("Element not found");
		 else
			 System.out.println("Element found at index = "+com);
		
		
		

	}

}
