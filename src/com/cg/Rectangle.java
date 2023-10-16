package com.cg;

public class Rectangle extends Figure {
	public Rectangle(double dimension1, double dimension2) {
		super(dimension1,dimension2);
	}
	public void area() {
		double areaofrectangle = dimension1*dimension2;
		System.out.println(areaofrectangle);
	}

}
