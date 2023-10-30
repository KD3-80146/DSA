package com.sunbem;

import java.util.LinkedList;
import java.util.Scanner;

public class StackImplement {
	
      public static void insertAtBottom(java.util.Queue<Integer>q1,int target)
      {
    	  if (q1.isEmpty()) {
              q1.add(target);
              return;
          }

          // Recursive case: Remove the top element, insert the target at the bottom, and then re-insert the removed elements.
          int topele = q1.poll();
          insertAtBottom(q1, target);
          q1.add(topele);
    	  
      }
	public static void reverse(java.util.Queue<Integer>q1)
	{
		  if (q1.isEmpty()) {
	            
	            return;
	        }

	        int target = q1.poll();
	        reverse(q1);
	        insertAtBottom(q1, target);
	        q1.add(target);
	    }
	

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter size");
	        int size = sc.nextInt();
	        java.util.Queue<Integer> q1 = new LinkedList<>();

	        System.out.println("Enter the elements:");
	        for (int i = 0; i < size; i++) {
	            int x = sc.nextInt();
	            q1.add(x);
	        }

	        // Reverse the queue.
	        reverse(q1);

	        // Print the reversed queue.
	        System.out.println("Reversed Queue:");
	        while (!q1.isEmpty()) {
	            System.out.println(q1.poll());
	        }
	    }

}
