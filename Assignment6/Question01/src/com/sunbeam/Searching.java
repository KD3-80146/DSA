package com.sunbeam;

public class Searching {
	
	class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	private Node root;
	
	
	public Searching() {
		this.root=null;
	}
	
	public boolean isEmpty()
	{
		return root==null;
	}
	
	public void add(int data)
	{
		Node nn=new Node(data);
		if(isEmpty())
		{
			root=nn;
		}
		else {
			Node trav=root;
		while(true)
		{
			
			if(data<trav.data)
			{
			   if(trav.left==null)
			   {
				   trav.left=nn;
				   break;
			   }
			   else
			   {
				   trav=trav.left;
			   }
		  }
			else
			{
				if(trav.right==null)
				{
					trav.right=nn;
					break;
				}
				else
				{
					trav=trav.right;
					
				}
			}
		}
		}
	}
	
	
//	public void search(int key)
//	{
//		if(isEmpty())
//		{
//			return;
//		}
//		else {
//		   Node trav=root;
//		   while(trav!=null) {
//			if(key==trav.data)
//			{
//				System.out.println("key found");
//				return;
//			}
//			else
//			{
//			  if(key<trav.data)
//			  {
//				  trav=trav.left;
//			  }
//			  else
//			  {
//				  trav=trav.right;
//			  }
//			}
//		   }
//		}
//		
//	}
	
	private void search(Node trav,int key)
	{

		if(trav==null)
		{
			System.out.println("Not Found");
			return;
		}
		if(key==trav.data)
		{
			System.out.println("found");
			return;
		}
		
			if(key<trav.data)
			{
				search(trav.left, key);
			}
			else
			{
				search(trav.right,key);  
			}
	}

	public void Search(int key)
	{
		 Node trav=root;
		 search(trav, key);
		 
	}
		
	
	void preOrder(Node trav)
	{
		if(trav==null)
		{
			return;
		}
		System.out.print(" "+trav.data);
		preOrder(trav.left);
		preOrder(trav.right);
		
	}
	public void PreOrder()
	{
		System.out.print("PreOrder :");
		preOrder(root);
		System.out.println(" ");
		
	}
	
	void postOrder(Node trav)
	{
		if(trav==null)
		{
			return;
		}
		postOrder(trav.left);
		postOrder(trav.right);
		System.out.print(" "+trav.data);
	}
	
	public void PostOrder()
	{
		System.out.print("PostOrder :");
		postOrder(root);
		System.out.println("");
	}
	
	void inOrder(Node trav)
	{
		if(trav==null)
		{
			return;
		}
		inOrder(trav.left);
		System.out.println(" "+trav.data);
		inOrder(trav.right);
		
	}
	public void inOrder()
	{
		System.out.println("Inorder :");
		
	}
	
	
	
	

}
