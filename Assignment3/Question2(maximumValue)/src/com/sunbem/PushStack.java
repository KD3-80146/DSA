package com.sunbem;

import java.util.Scanner;

public class PushStack {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.print("Enter size = ");
		size=sc.nextInt();
		
		Stack stk= new Stack(size);
		int max=Integer.MIN_VALUE;
		for(int i=0;i<size-1;i++)
		{
			int x;
		   x=sc.nextInt();
		   if(x>max)
		   {
			   max=x;
		   }
		   stk.push(x);	
		}
		
		System.out.println("Maximum is ="+max);

	}

}
