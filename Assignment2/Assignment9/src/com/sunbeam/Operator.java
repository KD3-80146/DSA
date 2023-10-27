package com.sunbeam;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
	  
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the operator to check precedence =");
		char c=sc.next().charAt(0);
		switch (c) {
		case '/':
		case '*':
		case  '%':
		System.err.println("Arthmatic precidence is 10");
			break;
		case '-':
		case '+':
			System.out.println("Artimatic precidene is 9");

		default:
			System.out.println("Refer this pdf for mor detail");
			System.err.println("https://www.php.net/manual/en/language.operators.precedence.php#:~:text=Operator%20Precedence%20%C2%B6,(%22%2B%22)%20operator.");
			break;
		}
		

	}

}
