
public class Stack {
   
	private int arr[];
	private int size;
	private int top;
	
	public Stack(int size) {
		arr=new int[size];
		this.size=size;
		this.top=-1;		
	}
	
	public void push(int data)
	{
		if(top==size-1)
			System.out.println("Stack is Full");
		else {
			top++;
			arr[top]=data;
		}
	}
	public void pop()
	{
		if(top==-1)
			System.out.println("Stack is Empty");
		top--;
	}
	public int peek()
	{
		if(top==-1)
			System.out.println("Stack is Empty");
		return arr[top];
	}

}
