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
		this.head=null;
		
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
		}
		else
		{
			n1.next=head;
			head=n1;
		}
	}
	
	
	public void  display()
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		else
		{
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
