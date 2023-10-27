package com.sunbeam;

public class CircularQueue {

	private int arr[];
	private int rear, front;
	private  int SIZE;
	 private int count=0;
	public CircularQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
		
	}
	public void push(int data) {
		
		rear = (rear + 1) % SIZE;
	    count++;
		arr[rear] = data;
	}
	
	public void pop() {
		count--;
		front = (front + 1) % SIZE;
		if(front == rear)
			front = rear = -1;
	}
	
	public int peek() {
		
		return arr[(front + 1) % SIZE];
	}
	
	public boolean isFull() {
		//return (front == rear && rear != -1) || (front == -1 && rear == SIZE - 1);
	      return (count==SIZE);
	}
	
	public boolean isEmpty() {
		//return front == rear && rear == -1;
		return (count==0);
	}

}
