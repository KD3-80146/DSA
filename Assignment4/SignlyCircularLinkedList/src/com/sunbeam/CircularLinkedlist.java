package com.sunbeam;

import java.util.LinkedList;

public class CircularLinkedlist {
	
	 class Node{
		 private int data;
		 private Node next;
		 
		 public Node(int data) {
			this.data=data;
			this.next=null;
		}
	 }
	 
	 private Node tail;
	 private int count;
	 
      public CircularLinkedlist() {
		this.tail=null;
		this.count=0;
	}
      
      public boolean isempty()
      {
    	  return tail==null;
      }
      
      public void addFirst(int data)
      {
    	  Node newNode=new Node(data);
    	  if(isempty())
    	  {
    		  tail=newNode;
    		  tail.next=newNode;
    		  
    	  }
    	  
    	  else
    	  {
    		
    		  newNode.next=tail.next;
    		  //tail=newNode;
    		  tail.next=newNode; 
    		
    		
//    		 else
//    		 {
//    			 
//    			 Node trav=tail;
//    			 newNode.next=tail;
//    			while(trav.next!=tail)
//    			{
//    			  trav=trav.next;
//    			}
//    			tail=newNode;
//    			trav.next=newNode;
//    			count++;
//    		 }
    	  }
      }
      
      public void addLast(int data)
      {
    	  Node newNode=new Node(data);
    	  if(isempty())
    	  {
    		  tail=newNode;
    		  tail.next=newNode; 
    	  }
    	  else {
    		 
    		  newNode.next=tail.next;
    		  tail.next=newNode;
    		  tail=newNode;
    		    
    	  }
      }
    	  
      public void deleteFirst()
      {
    	  if(isempty())
    	  {
    		  System.out.println("List is empty");
    	  }
    	  else
    	  if(tail.next==tail)
    	  {
    		  tail=null;
    	  }
    	  else {
    		 tail.next=tail.next.next;
    	  }
      }
      public void deleteLast()
      {
    	  if(isempty())
    	  {
    		  System.out.println("List is empty");
    	  }
    	  else
    	  if(tail.next==tail)
    	  {
    		  tail=null;
    	  }
    	  else
    	  {
    		  Node trav = tail;
    	        while (trav.next != tail) {
    	            trav = trav.next;
    	        }
    	        trav.next = tail.next;
    	        tail = trav;
    	        
    	  }
    	  
      }
      
      
      public void display()
      {
    	  if(isempty())
    	  {
    		  System.out.println("list is empty");
    	  }
    	  Node trav=tail;
    	  System.out.print("List : ");
    	   do {
    		   System.out.print(" "+trav.next.data);
    		   trav=trav.next;
    	   }while(trav!=tail);
    	   System.out.println();
    	  
      }

}
