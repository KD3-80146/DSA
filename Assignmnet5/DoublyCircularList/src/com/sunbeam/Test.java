package com.sunbeam;

public class Test {

	public static void main(String[] args) {
	  List l1=new List();
	  l1.addFirst(20);
	  l1.addFirst(30);
      l1.addFirst(58);
      l1.addFirst(60);
	  l1.display();
	 l1.addPos(33, 3);
	 l1.addPos(60, 4);
	
     l1.display();
    
  l1.deleteAtPos(3);
      l1.display();
//	  l1.display();
	
//	

	}

}
