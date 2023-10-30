package com.sunbem;

public class Stack {
  
	private int arr[];
	private int top;
	private int size;
	
	public Stack(int size)
	{
		this.size=size;
		this.top=-1;
		arr=new int[size];
	}
	
	public void push(int data) {
		top++;
		arr[top]=data;
	}
	public void pop()
	{
		top--;
	}
	public int peek()
	{
		return arr[top];
	}
	
	public boolean isFull()
	{
		return top==(size-1);
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	
}
