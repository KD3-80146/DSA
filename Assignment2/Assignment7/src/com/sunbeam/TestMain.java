package com.sunbeam;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int choice;
		 int size;
		 System.out.println("Enter the size");
		 size=sc.nextInt();
		 Queue q=new Queue(size);
		 
      do {
    	  System.out.println("1. Add");
    	  System.out.println("2 Pop");
    	  System.out.println("3 Peek");
    	  System.out.println("4 Exit");
    	  choice=sc.nextInt();
    	  switch (choice) {
		case 1:
			if(q.isFull())
			{
				System.out.println("Queue is full ");
			}
			else
			{
				int key;
				System.out.print("Enter key = ");
				key=sc.nextInt();
				q.push(key);
			}
			break;
			
		case 2:
			if(q.isEmpty())
			{
				System.out.println("Queue is empty");
			}
			else
			{
				q.pop();
				System.out.println("Element poped");
			}
			
           break;
           
		case 3:
			System.out.println("First element is "+q.peek());
			break;
	
			
		default:
			System.out.println("Enter the valid choice...:O");
			break;
		}
    	  
      }while(choice!=0);

	}

}
