

public class LinkedLIst {
	class Node{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int data)
		{
			this.data=data;
			next=null;
			prev=null;
		}
	}
	
	private Node head;
	
	   public int peek()
	   {
		   return head.data;
		   
	   }
	
       public LinkedLIst()
       {
    	   this.head=null;
       }
       public boolean isEmpty()
       {
    	   return head==null;
       }
     
 		  

       
       public void addFirst(int data)
       {
    	   Node n1=new Node(data);
    	   if(head==null)
    	   {
    		   head=n1;
    		   head.next=n1;
    		   head.prev=n1;
    	   }
    	   else
    	   {
    		   n1.next=head;
    		   n1.prev=head.prev;
    		   head.prev.next=n1;
    		   head.prev=n1;
    		   head=n1;
    		   
    	   }
       }
       
       public void deleteFirst()
       {
    	   if(isEmpty())
    	   {
    		   return;
    	   }
    	   if(head.next==head)
    	   {
    		   head=null;
    	   }
    	   else
    	   {
    		   head.next.prev=head.prev;
    		   head.prev.next=head.next;
    		   head=head.next;
    	   }
       }
       
       public void dispay()
       {
    	   if(isEmpty())
    	   {
    		   return;
    	   }
    	   else
    	   {
    		   Node trav=head;
    		   do {
    			   System.out.print(" "+trav.data);
    			   trav=trav.next;
    			   
    		   }while(trav!=null);
    	   }
       }

}
