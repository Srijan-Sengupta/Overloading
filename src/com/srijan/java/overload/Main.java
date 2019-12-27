package com.srijan.java.overload;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perimeter circle = new Perimeter(14);
		
		System.out.println("Perimeter = "+ circle.getPerimeter());
		
		Perimeter triangle = new Perimeter(12, 33, 66) ;
		
		System.out.println("Perimeter = "+ triangle.getPerimeter());
		
		Perimeter quadrilateral = new Perimeter(10, 65, 10 , 65) ;
		
		System.out.println("Perimeter = "+ quadrilateral.getPerimeter()+'\n');
		
		Area area = new Area();
		
		area.calculateArea(16);
		
		System.out.println("Area of Square= "+ area.getArea());
		
		area.calculateArea(12, 5);
		
		System.out.println("Area of Rectangle= "+ area.getArea());
	}

}
