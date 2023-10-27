package com.sunbeam;

import java.util.Arrays;
import java.util.Iterator;

public class TestEmployee {
	  
	public static void sortEmployee(Employee []arr,int size)
	{
		for(int i=0;i<size-1;i++)
		{
		  for (int j=0;j<size-1;j++)
           {    
			if(arr[j].getSalary()>arr[j+1].getSalary())
			{
				Employee e1=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=e1;
				
			}
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		Employee []arr=new Employee[5];
		arr[0]=new Employee(1,"ram",8000);
		arr[1]=new Employee(2,"shyaam",7000);
		arr[2]=new Employee(3,"Rawan",6000);
		arr[3]=new Employee(4,"ravi",5000);
		arr[4]=new Employee(5,"sonu",4000);
		
		//System.out.println("Before sorting array elemet are -:"+Arrays.toString(arr));
		
		for (Employee e: arr) {
			System.out.println(e);
		}
		
		sortEmployee(arr,arr.length);
		System.out.println("**************************");
       // System.out.println("After sorting array elemet are -:"+Arrays.toString(arr));
	
		for (Employee e: arr) {
		System.out.println(e);
	}
		

	}

}
