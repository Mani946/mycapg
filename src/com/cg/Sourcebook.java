package com.cg;

import java.util.Scanner;

public class Sourcebook {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter book no");
int bno=sc.nextInt();
System.out.println("enter book title name");
String title=sc.next();
System.out.println("enter author");
String author=sc.next();
System.out.println("total price");
int price=sc.nextInt();
Book1 b=new Book1(bno,title,author,price);
System.out.println(b);
b.discountedPrice(5);
b.displayDetails();
	}









	}


