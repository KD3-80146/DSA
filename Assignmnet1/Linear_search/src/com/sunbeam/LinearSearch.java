package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearch {
	
	  public static int linearSearch(int arr[] ,int key) {
		  int comp=0;
		  for(int i=0;i<arr.length;i++)
		  {
			  comp++;
			  if(arr[i]==key)
			  {
				  break;
			  }
			  
		  }
		  return comp;
	  }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Size of array");
//		int size;
//		 size=sc.nextInt();
//		List<Integer> list =new ArrayList<Integer>();
//		System.out.println("Enter the element of array");
//		for(int i=0;i<size;i++)
//		{
//		    int x;
//		    x=sc.nextInt();
//		    list.add(i);
//		}
		int arr[]= {10,20,30,40};
		
	     System.out.println("Enter key");
	     int key=sc.nextInt();
	     int com=linearSearch(arr, key);
	     System.out.println("Total no of comparision is = ");
		
	}

}
