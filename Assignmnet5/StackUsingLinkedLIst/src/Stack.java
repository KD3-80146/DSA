
import java.util.Scanner;

public class Stack {
	
		
		
	   LinkedLIst l1;
	   
	   public Stack() {
		
		   l1=new LinkedLIst();
	}
	  public void push()
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter Data :");
		  int x=sc.nextInt();
		  l1.addFirst(x);
	  }
	  
	  public void pop()
	  {
		  if(!l1.isEmpty())
		  {
		  l1.deleteFirst();
		  System.out.println("Element Pop");
		  }
		  else
		  {
			  System.out.println("stack is Empty");
		  }
	  }
	  
	  public void peek()
	  {
		  if(!l1.isEmpty())
		  System.out.println("first Element is = "+l1.peek());
		  else
		  System.out.println("No Element found");
	  }
	

}
