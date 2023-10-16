package com.cg;

public class Triangle extends Figure {
	public Triangle(double dimension1, double dimension2) {
		super(dimension1,dimension2);
	}
public void area() {
	double  areaoftriangle =(0.5*dimension1*dimension2);
	System.out.println(areaoftriangle);
}
}
	
