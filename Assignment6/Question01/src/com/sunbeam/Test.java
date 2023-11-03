package com.sunbeam;

public class Test {

	public static void main(String[] args) {
		
		Searching s1=new Searching();
		
		s1.add(10);
		s1.add(20);
		s1.add(40);
		s1.add(50);
		s1.add(55);
		
		s1.PreOrder();
        s1.PostOrder();
        s1.Search(10);
        }

}
