import java.util.Scanner;

public class Dequeue {
	
	LinkedList l1;
	
	Scanner sc=new Scanner(System.in);
	public Dequeue() {
		l1=new LinkedList();
	}
	
	
	public void push()
	{
		System.out.print("Enter Data : ");
		int x=sc.nextInt();
		l1.addFirst(x);
	}
	public void popFirst()
	{
		if(!l1.isEmpty())
		{
			l1.deleteFirst();
		}
		else {
			System.out.println("list is Empty");
		}
	}
	public void PopLast()
	{
		if(!l1.isEmpty())
		{
			l1.deleteLast();
		}
		else
		{
			System.out.println("List is empty");
		}
	}
	
	public void Display()
	{
		l1.Display();
	}
	
	

}
