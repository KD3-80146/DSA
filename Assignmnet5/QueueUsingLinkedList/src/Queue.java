import java.util.Scanner;

public class Queue {
	
	LinkedList l1;
	
	Scanner sc=new Scanner(System.in);
	public Queue() {
		 l1=new LinkedList();
	}
	
	public void push()
	{
		System.out.println("Enter Data");
		int x=sc.nextInt();
		l1.addFirst(x);
		System.out.println("Elemnt Added");
	}
	public void pop()
	{
		if(!l1.isEmpty())
		{
		l1.deleteLast();
		System.out.println("Element Poped");
		}
		else
		{
			System.out.println("Queue is Empty");
		}
	}
	public void peek()
	{
		if(!l1.isEmpty())
		{
			System.out.println("Last Elememt ="+l1.peek());
		}
		else
		{
			System.out.println("Queue is Empty");
		}
	}

}
