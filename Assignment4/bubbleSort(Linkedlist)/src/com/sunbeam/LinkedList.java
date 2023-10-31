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
	private int count;
	
	public LinkedList() {
		this.head=null;
		this.count=0;
		
	}
	public boolean isEmpty()
	{
		count++;
		return head==null;
	}
	
	public void addFirst(int data)
	{
		Node n1=new Node(data);
		
		if(isEmpty())
		{
			count++;
			head=n1;
		}
		else
		{
			count++;
			n1.next=head;
			head=n1;
		}
	}
	
	 public void bubble()
	 {
		 for(int i=0;i<count-1&&head.next!=null;i++)
		 {
			 for(int j=i+1;j<count&&head.next!=null;j++)
			 {
				
			 }
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
