package com.sunbeam;

public class Bubble {
	
	class Node{
		private int data;
		private Node next;
		public Node(int data)  {
			next=null;
			this.data=data;
		}
	}
	
	private Node head;
	
	public Bubble() {
		head=null;
	}
	
	
	public void addFirst(int data)
	{
		Node n1 =new Node(data);
		if(head==null)
			head=n1;
		
		else
		{
			n1.next=head;
			head=n1;
		}
		
		
	}
	
	public void dispay()
	{
		if(head==null)
			return;
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
	
	public void bubble()
	{
		if(head==null)
			return;
		
		for(Node i=head;i!=null;i=i.next)
		{
			for(Node j=head;j.next!=null;j=j.next)	
			{
				if(j.data>j.next.data)
				{
					int temp=j.data;
					j.data=j.next.data;
					j.next.data=temp;
				}
				
			}
		}
		
	}

}
