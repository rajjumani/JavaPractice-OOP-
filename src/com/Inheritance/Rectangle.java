package com.Inheritance;

public class Rectangle extends Shape{

	int height , width;
	
	public Rectangle(String color , int height , int width) {
		super(color);
		this.height = height;
		this.width = width;
	}

	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return height*width;
	}
	
	@Override
	public String toString() {
		return "color : " + color + " , height : " + height + " , width : " + width;
	}

}
