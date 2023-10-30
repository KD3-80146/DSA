package com.sunbeam;

public class TestData {
	
	

	public static void main(String[] args) {
		ReverselinkedList rs=new ReverselinkedList();
         
		rs.addlast(10);
		rs.addlast(20);
		rs.addlast(49);
		rs.addlast(60);
		rs.addlast(60);
		rs.Display();
		rs.reverse();
		rs.Display();
	}

}
