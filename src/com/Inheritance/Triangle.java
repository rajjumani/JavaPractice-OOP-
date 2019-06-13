package com.Inheritance;

public class Triangle extends Shape{

	int base , altitude;
	
	public Triangle(String color , int base , int altitude) {
		super(color);
		this.base = base;
		this.altitude = altitude;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5*base*altitude;
	}
	
	@Override
	public String toString() {
		return "color : " + color + " , base = " + base + " , altitude : " + altitude ;
	}
	

}
