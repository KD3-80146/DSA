
public class BST {
	class Node{
     private int data;
     private Node left;
     private Node right;
     
     public Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
		
	}
     
      private Node root;
      public void BST()
      {
    	  this.root=null;
      }
      
      public boolean isEmpty()
      {
    	  return root==null;
      }
      

	}
}
