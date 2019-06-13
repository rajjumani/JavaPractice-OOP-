package com.Inheritance;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rectangle = new Rectangle("red", 10, 10);
		System.out.println("area of rectangle : " + rectangle.getArea());
		System.out.println("to string of rectangle : " + rectangle.toString());
		
		
		Triangle triangle = new Triangle("green", 10, 10);
		System.out.println("area of traingle : " + triangle.getArea());
		System.out.println("to string of traingle : " + triangle.toString());
		
	}

}
