package com.srijan.java.overload;

public class Area {
	private double area;
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void calculateArea(int side){
		// if only one side as in put then all other sides are equal is given - it is a square
		this.area=side*side; 
	}
	
	public void calculateArea(int side1,int side2){
		// if only two side as in put then all other sides are equal are given - it is a rectangle
		this.area=side1*side2; 
		}

}
