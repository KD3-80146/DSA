package com.sunbem;

public class Queue {
	private int arr[];
	private int front;
	private int rare;
	private int  size;
	
	public Queue(int size)
	{
		this.size=size;
		this.front=-1;
		this.rare=-1;
		arr=new int[size];
	}
	
	public void push(int data)
	{
		rare++;
		arr[rare]=data;
	}
	public void pop()
	{
		front++;
	}
	public int peek()//last element to be inserted
	{
		return arr[front+1];
	}
	
	public boolean isFull()
	{
		return front==size-1;
	}
	
	public boolean isEmpty()
	{
		return rare==front;
	}

}
