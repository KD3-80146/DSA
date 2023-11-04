
public class MaxMin {
      class Node{
    	  private int data;
    	  private Node next;
    	  
    	  public Node(int data) {
			this.data=data;
			this.next=null;
		}
      }
      
      private Node head;
      
      public MaxMin() {
		head=null;
	}
      
      
      public void addFirst(int data)
      {
    	  Node n1=new Node(data);
    	  if(head==null)
    	    head=n1;
    	  
    	  else {
    		  n1.next=head;
    		  head=n1;
    	  }
      }
      
      public   int minFind()
      {
    	  int min=Integer.MAX_VALUE;
    	  if(head==null)
    	   return 0;
    	  else
    	  {
    		  Node trav=head;
    		  while(trav!=null)
    		  {
    			  if(trav.data<min)
    			  {
    				  min=trav.data;
    			  }
    			  trav=trav.next;
    		  }
    		  
    	  }
    	  
    	  return  min;
      }
      
      public   int maxFind()
      {
    	  int max=Integer.MIN_VALUE;
    	  if(head==null)
    	   return 0;
    	  else
    	  {
    		 
    		  
    		  Node trav=head;
    		  while(trav!=null)
    		  {
    			  if(trav.data>max)
    			  {
    				  max=trav.data;
    			  }
    			  trav=trav.next;
    		  }
    		  
    	  }
    	  
    	  return  max;
      }
      
      public void display()
      {
    	  if(head==null)
    		  return;
    	  
    	  Node trav=head;
    	  
    	  while(trav!=null)
    	  {
    		  System.out.print(" "+trav.data);
    		  trav=trav.next;
    	  }
    	  System.out.println();
    	  
      }
      
}
