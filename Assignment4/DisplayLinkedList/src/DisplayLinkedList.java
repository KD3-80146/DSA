
public class DisplayLinkedList {
	
	class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
		  this.data=data;
		  this.next=null;
		}
	}
	
	private Node head;
	
	
	public DisplayLinkedList() {
		this.head=null;
	}
	
	public void addFirst(int data)
	{
		Node n1=new Node(data);
		if(head==null)
		{
			head=n1;
		}
		else
		{
			n1.next=head;
			head=n1;
		}
	}
	
	
	public void Display(Node trav)
	{
		if(trav==null)
			return;
		else
		{
			Display(trav.next);
			System.out.print(" "+trav.data);
		}
	}
	
	public void display()
	{
		 Node trav=head;
		 Display(trav);
		
	}

}
