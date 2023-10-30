package com.sunbeam;



public class CircularList {

	public static void main(String[] args) {
		
	   CircularLinkedlist list=new CircularLinkedlist();
	   
	     list.addFirst(10);
	     list.addFirst(20);
	     list.addFirst(30);
	     list.addFirst(40);
	     list.addLast(30);
	     list.display();
	     list.deleteFirst();
	     list.deleteLast();
	   
	     
	     list.display();
	     
	}

}
