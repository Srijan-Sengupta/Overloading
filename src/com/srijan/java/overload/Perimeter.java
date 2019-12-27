package com.srijan.java.overload;

public class Perimeter {
	private double perimeter;
	//overloaded constructers:
	public Perimeter(int side1,int side2,int side3){
		//if it is a triangle, it has three sides
		System.out.println("It is a triangle");
		
		this.perimeter = side1 + side2 + side3;
		
	}
	
	public Perimeter(double side){
		//if it is a square, it has three sides
		System.out.println("It is a rectangle");
		
		this.perimeter = 4*side;
	}
	
	public Perimeter( int side1, int side2, int side3, int side4 ){
		//if it is a Rectangle, it has four sides
		System.out.println("It is a Quadrilateral");
		
		this.perimeter = side1 + side2 + side3 + side4;
	}
	
	
	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	
	
	
	
}