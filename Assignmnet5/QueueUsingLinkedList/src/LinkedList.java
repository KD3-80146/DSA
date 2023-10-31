
public class LinkedList {
        class Node{
        	private int data;
        	private Node next;
        	private Node perv;
        	
        	public Node(int data) {
				 this.data=data;
				 this.next=null;
				 this.perv=null;
			}
        }
        
        private Node head;
        
        public LinkedList() {
			this.head=null;
		}
        public boolean isEmpty()
        {
        	return head==null;
        }
        
        public void addFirst(int data)
        {
        	Node n1= new Node(data);
        	if(isEmpty())
        	{
        		head=n1;
        	    head.next=n1;
        	    head.perv=n1;
        	}
        
        	else
        	{
        		n1.next=head.next;
        		n1.perv=head;
        		head.perv.next=n1;
        		head.perv=n1;
        		head=n1;
        	}
        }
        public int peek()
        {
        	return head.data;
        }
        
        public void deleteLast() {
        	if(isEmpty())
        	{
        		System.out.println("Stack is Empty");
        	}
        	else
        		if(head==head.next)
        	{
        		head=null;
        	}
        		else
        		{
        			head.perv.perv.next=head;
        			head.perv=head.perv.perv;
        		}
        }
}
