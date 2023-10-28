package com.sunbeam;

public class FindRank {
	 
	public static int rankFind(int[] arr,int size,int key)
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			 if(arr[i]<=key)
			 {
				 count++;
			 }
		}
		
		
		return count;
	}

	public static void main(String[] args) {
		
				
	   int arr[]={ 10, 20, 15, 3, 4, 4, 1 };
	   int key=4;
	   int result=rankFind(arr,arr.length, key);
	   System.out.println(result);

	}

}
