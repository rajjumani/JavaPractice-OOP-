package com.Inheritance;

public class Shape {

	String color;
	
	public Shape(String color) {
		this.color = color;
	}

	public double getArea() {
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "color  : " + color;
	}
	
}
