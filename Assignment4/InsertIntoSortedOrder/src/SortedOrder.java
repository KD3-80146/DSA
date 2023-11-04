
public class SortedOrder {

	class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	private Node head;
	
	public SortedOrder() {
		this.head=null;
		
	}
	
	public void addAtposition(int data)
	{
		Node trav=head;
		Node n2 =new Node(data);
		if(head==null)
		 head=n2;
		else
		{
			if(trav.data>data || trav.next==null)
			{
			   n2.next=head;
			   head=n2;
			}
			else
			{
				
				 
		            while (trav.next != null && trav.next.data < n2.data) {
		               
		               trav = trav.next;
		            }
		            
		           n2.next = trav.next;
		            trav.next = n2;
		        }
		}
			
		}
		
	
	
	public void addLast(int data)
	{
		Node n1 =new Node(data);
		if(head==null)
			head=n1;
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
	public void display(Node trav)
	{
		if(head==null)
			return;
		if(trav==null)
		    return;
		else
		{
			System.out.print(" "+trav.data);
			display(trav.next);
		}
	}
	
	public void dispay()
	{
		Node trav=head;
		display(trav);
	}
	

}
