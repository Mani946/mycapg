package com.cg;
import java.util.Scanner;

public class Rohit{

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Employee Id");
	int Empid=sc.nextInt();
	System.out.println("enter Employee Name");
	String Empname=sc.next();
	System.out.println("enter Employee Basic pay");
	int basicpay=sc.nextInt();
	Employee emp=new Employee(Empid,Empname,basicpay);
	emp.display();
	System.out.println(emp);
	emp.generateSalary();
	
	

	}
	
}
