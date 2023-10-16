package com.cg;

public class Book1 {
	int bno;
	String title;
	String author;
	int price;
	public int totaldiscount;
	public int d;
	public Book1(int bno, String title, String author, int price) {
		this.bno = bno;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void displayDetails() {
		
	}

	@Override
	public String toString() {
		return "Book1 [bno=" + bno + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	void discountedPrice(int d)
	{
	int totaldiscount=price *(d)/100;
	int discount=price-totaldiscount;
	System.out.println("discount");
}

}
