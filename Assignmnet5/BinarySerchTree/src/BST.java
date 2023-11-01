
public class BST {
	class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;

		}

		}
	private Node root;
 
	
	public void BST() {
		this.root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

       void add(Node n1,Node trav) {

		if (isEmpty()) {
			this.root = n1;
			return;
			
		}
		

		if (n1.data < trav.data) {
			if (trav.left == null) {
				trav.left = n1;
				return;

			} else {
				add(n1,trav.left);

			}
		} else {
			if (trav.right == null) {
				trav.right = n1;
				return;
			} else {
				add(n1,trav.right);
			}
		}
	}
	
	public void add2(int data)
	{
		Node n1=new Node(data);
		Node trav=root;
		add(n1,trav);
	}
	
	private void preOrder(Node trav) {
		if(trav == null)
			return;
		System.out.print(" " + trav.data);
		preOrder(trav.left);
	
		preOrder(trav.right);
	}
	
	public void preOrder() {
		System.out.print("Preorder : ");
		preOrder(root);
		System.out.println("");
	
	}
}
