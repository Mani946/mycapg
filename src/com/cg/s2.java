package com.cg;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int a=10;
		char b='d';
		double d= 3.42;
		boolean flag= false;
		
	System.out.println("hello welcome to java world");
	
	System.out.println("integer value"+a);
	System.out.println("character value"+b);
	System.out.println("double value"+d);
	System.out.println("boolean value"+flag);
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Country: ");
	String country = sc.next();
	System.out.println("Enter Captain: ");
	String captain = sc.next();

	System.out.println("Enter the number of matches:");
	int matches = sc.nextInt();
	Match match =new Match(country, captain, matches);
	System.out.println(match);

	}
	
	
}


	


