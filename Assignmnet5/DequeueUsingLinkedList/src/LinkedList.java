
public class LinkedList {
	
	class Node{
		
	   private int data;
	   private Node next;
	   private Node prev;
	
	    public Node(int data) {
		   this.data=data;
		   this.next=null;
		   this.prev=null;
	    }
	}
	
	 private Node head;
	 private int count;
	 
	 
	 
	 public int getCount() {
		return count;
	}
	
	public LinkedList() {
		head=null;
		this.count=0;
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
			 head.next=n1;
			 head.prev=n1; 
			 count++;
		 }
		 else
		 {
			 n1.next=head;
			 n1.prev=head.prev;
			 head.prev.next=n1;
			 head.prev=n1;
			 head=n1;
			 count++;
		 }
	 }
	 
	 public void deleteFirst()
	 {
		 if(isEmpty())
		  {
			 System.out.println("Please Enter Element");
			 
		 }
		 else
		 if(head==head.next)
		 {
			 head=null;
			 count--;
		 }
		 else {
			 head.prev.next=head.next;
			head.next.prev=head.prev;
			head=head.next;
			count--;
			
		 }
	 }
	 
	 public void deleteLast()
	 {
		 if(isEmpty())
		 {
			 System.out.println("please Enter Element");
		 }
		 else
			 if(head.next==head)
			 {
				 head=null;
				 count--;
			 }
			 else {
				 
				 head.prev.prev.next=head;
				 head.prev=head.prev.prev;
			 }
				 
	 }
	 public void Display()
	 {
		 if(isEmpty())
		 {
			 System.out.println("List is Empty");
		 }
		 else
		 {
			 System.out.print("List : ");
			 Node trav=head;
			 do {
				 System.out.print(" "+trav.data);
				 trav=trav.next;
				 
				
			} while (trav!=head);
		 }
	 }
}
