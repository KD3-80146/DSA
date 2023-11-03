package com.bst;

public class DeleteNode {
	
	class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int data) {
			this.data=data;
			left=null;
			right=null;
			
		}
	}
	
       private Node root;
       
       public DeleteNode() {
		this.root=null;

	}
       
       public boolean isEmpty()
       {
    	   return root==null;
       }
       public void add(int data)
       {
    	   Node n1=new Node(data);
    	  if(isEmpty())
    	  {
    		  root=n1;
    		  
    	  }
    	  else
    	  {
    		  Node trav=root;
    		  while(true) {
    		 
    		  if(data<trav.data)
    		  {
    			  if(trav.left==null)
    			  {
    				  trav.left=n1;
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
    				  trav.right=n1;
    			  }
    			  else
    			  {
    				  trav=trav.right;
    			  }
    		  }
    	  }
    		  
    	  }
       }
       
       public Node[] binarySearch(int key)
       {
    	   Node trav=root;
    	   Node parent=null;
    	   while(trav!=null)
    	   {
    		   if(key==trav.data)
    		   {
    			  break;
    		   }
    		   parent =trav;
    		   
    		   if(key<trav.data)
    		   {
    			   trav=trav.left;
    		   }
    		   else
    		   {
    			   trav=trav.right;
    		   }
    		   
    	   }
    	   if(trav==null)
    	   {
    		   parent=null;
    	   }
    	   
    	   return new Node[] {trav,parent};
       }
       public  void delete(int key)
       {
    	   Node arr[]=binarySearch(key);
    	   
    	   Node temp=arr[0],parent =arr[1];
    	   if(temp==null)
    	    return;
    	   if(temp.left!=null && temp.right!=null)
    	   {
    		   Node trav=temp.left;
    		   parent=temp;
    		   while(trav.right!=null)
    		   {
    			   parent=trav;
    			   trav=trav.right;
    		   }
    		   temp.data=trav.data;
    		   temp=trav;
    	   }//left
    	   if(temp.left==null)
    	   {
    		   if(temp==root)
    		   {
    			   root=temp.right;
    		   }
    		   else
    		   {
    			   if(temp==parent.left)
    			   {
    				   parent.left=temp.right;
    			   }
    			   else
    			   {
    				   parent.right=temp.left;
    			   }
    		   }
    	   }
    	   else
    	   {//right
    		   if(temp==root)
    			   root=temp.left;
    		   else if(temp==parent.left)
    		        parent.left=temp.left;
    		   else
    			   parent.right=temp.left;
    	   }
    	   
    	  
    	   
       }
       
       private void postOrder(Node trav) {
   		if(trav == null)
   			return;
   	
   		postOrder(trav.left);
   		postOrder(trav.right);
   		System.out.print(" " + trav.data);
   	}
   	
   	public void postOrder() {
   		System.out.print("Postorder : ");
   		postOrder(root);
   		System.out.println("");
   	}
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       

}
