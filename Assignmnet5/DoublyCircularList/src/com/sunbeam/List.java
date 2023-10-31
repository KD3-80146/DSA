package com.sunbeam;

public class List {
	
	class Node{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
			this.next=null;
		}
	}
	  private Node head;
	  private int count;
	  
	   public List() {
		   this.head=null;
		   this.count=0;
	   }
	   public boolean isEmpty()
	   {
		   return head==null;
	   }
	   
	  public void addFirst(int data)
	  {
		  Node n1=new Node(data);
		   if(isEmpty())
		   {
			   head=n1;
			   head.next=n1;
			   head.prev=n1;
			   count++;
		   }
		   else
		   {
			   n1.next=head;
			   n1.prev=head.prev;
			   head.prev.next=n1;
			   head.prev=n1;
			   head=n1;
			   count++;
			   
		   }
		   
	  }
	  
	  public void deleteAtPos(int pos)
	  {
		 
		  if(isEmpty())
		  {
			  System.out.println("List is empty");
			  return;
		  }
		  else {
			  if(head.next==head)
			  {
				  head=null;
				  count--;
			  }
			 
				  Node trav=head;
				  for(int i=1;i<pos;i++)
				  {
					  trav=trav.next;
				  }
				 
				  trav.prev.next=trav.next;
				  trav.next.prev=trav.prev;
				  count--;
				 
				 
				  
			  
		  }
		  	  
		  
	  }
	  public void addPos(int data,int pos)
	  {
		  Node n1=new Node(data);
		  if(pos<=1)
		  {
			  addFirst(data);
			  count++;
		  }
		  else
		  {
			  Node trav=head;
			  if(pos<=count+1)
			  {
				  for(int i=1;i<pos;i++)
				  {
					  trav=trav.next;
				  }
				  n1.next=trav.next;
				  n1.prev=trav;
				  trav.next=n1;
				  trav.next.prev=n1;
				  count++;
				  
			  }
			  else
			  {
				  System.out.println("please Enter valid position");
			  }
		  }
	  }
	  
	
	  
    public void DeleteFirst()
    {
    	if(isEmpty())
    	{
    		System.out.println("No list found");
    	}
    	else
    	{
	    		if(head.next==head)
    		{
	    			head=null;
	    			count--;
	    		}
	    		else
	    		{
	    			
	    			head.prev.next=head.next;
	    			head.next.prev=head.prev;
	    			head=head.next;
	    			count--;
	    		}
	    	}
	    }
	  public void display()
	  {
		  if(isEmpty())
		  {
			  System.out.print("List is Empty");
		  }
		  else
		  {
			  Node trav=head;
			do {
				System.out.print(" "+trav.data);
				trav=trav.next;
				
			}while(trav!=head);
			System.out.println();
		  }
	  }


}
