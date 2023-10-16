package com.cg;

public class book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 private int bno;
 private string title;
 private author;
 private int price;
 public book(int bno, string title, int price) {
	super();
	this.bno = bno;
	this.title = title;
	this.price = price;
}
 public void displayDetails()
 {
	 System.out.println("\n Book number: "+bno);
	 System.out.println("\n Book title: "+title);
	 System.out.println("\n Book author: "+author);
	 System.out.println("\n Book price: " +price);
	 public void discounted(int discount)
	 {
		 System.out.println("/n after discount="+(100-discount)*price)/100);
	 }



	 
 }
