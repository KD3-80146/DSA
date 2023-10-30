package com.sunbeam;

public class ReverselinkedList {

	class Node{
		private int data;
		private Node next;

		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}

	private Node head;

	public ReverselinkedList() {
		this.head=null;
	}

	public boolean isempty()
	{
		return head==null;
	}

	public void addlast(int data)
	{
		Node n1 = new Node(data);
		if(isempty())
		{
			head=n1;
		}
		else
		{
			Node trav=head;
			while(trav.next!=null)
			{
			     trav=trav.next;
			}

			trav.next=n1;

		}

	}
	public void reverse()
	{
		Node prv=null;
		Node trav=head;
		Node next;
		while(trav!=null)
		{
			next=trav.next;
			
			trav.next=prv;
			
			prv=trav;
			trav=next;
		}
		head=prv;
	}

	public void Display()
	{
		if(isempty())
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