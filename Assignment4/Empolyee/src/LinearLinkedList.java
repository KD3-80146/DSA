
public class LinearLinkedList {
	
	class Node{
		
		private Employee data;
		private Node next;
		
		public Node(Employee e1) {
			e1=new Employee();
			e1.acceptData();
			 this.data=e1;
			this.next=null;
		}
	}
	
	private Node head;
	
	public void add(Employee data)
	{
		Node n1=new Node(data);
		
		if(head==null)
			head=n1;
		
		else
		{
			n1.next=head;
			head=n1;
		}
	}
	
	public void delete(int id)
	{
		int flag=0;
		
		if(head==null)
			return;
		if(head.data.getId()==id)
		{
			if(head.next==null)
			{
				head=null;
			}
			else
			{
				head=head.next;
			}
		}
		
		else {
			Node trav=head;
			while(trav.next!=null)
			{
				if(trav.next.data.getId()==id)
				{
					flag=1;
					break;
				}
				trav=trav.next;
			}
			if(flag==1)
			trav.next=trav.next.next;
			else
				System.out.println("Not found");
			
		}
		
	}
	
	public void Update(double salary ,int id) {
		if(head==null)
			return;
		else
		{
			Node trav=head;
			while(trav.next!=null)
			{
			if(trav.data.getId()==id)
			{
				trav.data.setSalary(salary);
				System.out.println("updated");
				 break;
			}
			trav=trav.next;
			}
			
		}
	}

	public void search(String name) {
		if(head==null)
			return;
		else
		{
			Node trav=head;
			while(trav.next!=null)
			{
			if(trav.data.getName()==name)
			{
				System.out.println(trav.data);
				 break;
			}
			trav=trav.next;
			}
		}
	}
	
	public void display()
	{
		
		if(head==null)
			return;
		else {
			Node trav=head;
			while(trav!=null)
			{
				System.out.println(" "+trav.data.toString());
				trav=trav.next;
			}
		}
	}
    

}
