package com.sunbeam;

import java.util.Scanner;

public class TestCircularQueue {

	public static void main(String[] args) {
	
		CircularQueue q1=new CircularQueue(4);
		  int choice;
		  Scanner sc=new Scanner(System.in);
		  
      do {
    	  System.out.println("1 PUSH");
    	  System.out.println("2  POP");
    	  System.out.println("3 PEEK");
    	  System.out.println("4 EXIT");
    	  System.out.print("Enter choice = ");
    	  choice=sc.nextInt();
    	  switch (choice) {
		case 1:
			if(q1.isFull())
			{
				System.out.println("Element is full");
				break;
			}
			System.out.println("Enter The Element = ");
			int key=sc.nextInt();
			q1.push(key);
			break;
		case 2:
			if(q1.isEmpty())
			{
				System.out.println("empty");
			}
			else {
				
				q1.pop();
				System.out.println("element poped");
			}
			break;
		case 3:
			if(q1.isEmpty())
			{
				System.out.println("empty");
			}
			else
			{
				System.out.println("First element is"+q1.peek());
			}
			break;
		
		case 4:
			choice=0;
		default:
			
			break;
		}
      }while(choice!=0);

	}

}
