package com.sunbeam;

public class Queue {
       private int arr[];
       private int rear,front;
       private int size;
       
       public Queue(int size)
       {
    	   this.size=size;
    	   arr =new int[size];
    	   rear=0;
    	   front=0;
       }
       

	public void push(int element) {
		rear++;
		arr[rear]=element;
	}
	public void pop()
	{
		front++;
	}
	public int  peek()
	{
		 return arr[front+1]; 
	}
	public boolean isEmpty()
	{
		if(front==rear||(rear==0 && front==0))
		{
			return true;
		}
		return false;
	}
      
	public boolean isFull()
	{
		if(rear==size-1)
		{
			return true;
		}
		return false;
	}
       
}
