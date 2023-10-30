package com.sunbeam;

public class TestMIddleElement {
	
	

	public static void main(String[] args) {
		
		LinkedList l1=new LinkedList();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);
     	l1.addFirst(37);
		l1.Display();
		int x=l1.reverse();
		System.out.println(x);
		

	}

}
