
package com.sunbeam;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter the size");
		size=sc.nextInt();
		Stack stk=new Stack(size);
		int arr[]=new int[size];
		for(int i=0;i<arr.length-1;i++)
		{
			int x;
			x=sc.nextInt();
			if(!stk.isFull())
			stk.push(x);
			else
			System.out.println("stack is full");
			
		}
		
		while(!stk.isEmpty())
		{
			System.out.print(stk.peek()+" ");
			stk.pop();
		}
		
	}

}
