package com.cg;
import java.util.Scanner;
public class test {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book no:");
		int bookno=sc.nextInt();
		System.out.println("Enter Title:");
		String title=sc.nextInt();
		System.out.println("Enter Author name:");
		String author=sc.nextInt();
		System.out.println("Enter Price:");
		int price=sc.nextInt();
		System.out.println("Enter Discount:");
		int discount=sc.nextInt();
		Book b=new Book(bno,title,author,price);
		b.displayDetailsis();
		b.Discountedprice(discount);

		

		


		

		

