package com.sunbeam;


public class LinkedList {
	
	class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
		
	}
	
	private Node head;
	
	public LinkedList() {
		head=null;
		
	}
	public boolean isempty()
	{
		return head==null;
	}
	public void addFirst(int data)
	{
		Node newNode = new Node(data);
		if(isempty())
		{
			head=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	
	public int reverse()
	{
		 Node first=head;
		 Node last=head;
		 if(head==null)
		 {
			 System.out.println("Empty");
		 }
		 else
		 {
			 while(last.next!=null && first.next!=null)
			 {
				 first =first.next;
				 last=last.next.next;
				  
			 }
			 
		 }
		 int x=first.data;
		 
		 return x;
		
	}
	
	public void Display()
	{
		if(isempty())
		{
			System.out.println("List is empty");
		}
		else
		{
			System.out.print("List : ");
			Node trav=head;
			while(trav!=null)
			{
				System.out.print(" "+trav.data);
				trav=trav.next;
			}
			System.out.println();
		}
	}

}
