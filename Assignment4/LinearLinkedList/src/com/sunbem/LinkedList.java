package com.sunbem;

public class LinkedList {
  
	public class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	

	private Node head;
	private Node tail;
	
	public LinkedList() {
		this.head=null;
		this.tail=null;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFist(int data)
	{
		Node newNode =new Node(data);
		
		if(head==null&& tail==null)
		{
			head=newNode;
			tail=newNode;
			
		}
		else {
			newNode.next=head;
			head=newNode;
		}
		
	}
	public void addLast(int data)
	{
		Node newNode =new Node(data);
		
		if(head==null&& tail==null)
		{
			head=newNode;
			tail=newNode;
			
		}
		else
		{
		  tail.next=newNode;
		  tail=newNode;
		  
		}
	}
	public void deleteFirst() {
		if(isEmpty())
		{
			System.out.println("List is Empty");
		}
		else
		{
			if(head.next==null)
			{
				head=null;
				
			}
			else
			{
			   head=head.next;
			}
		}
	}
	
	public void deleteLast()
	{
		if(isEmpty())
		{
			System.out.println("List  is Empty");
		}
		else
		{
			Node trav=head;
			while(trav.next.next!=null)
			{
				trav=trav.next;
			}
			tail=trav;
			trav.next=null;
		}
	}
	
	
	public void display()
	{
		
		if(isEmpty())
		{
			System.out.println("List is Empty");
		}
		else
		{
			Node trav=head;
			System.out.print("List :");
			while(trav !=null)
			{
				System.out.print(" "+trav.data);
				trav=trav.next;
			}
			System.out.println();
		}
	}
}
