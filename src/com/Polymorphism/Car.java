package com.Polymorphism;

public class Car extends Vehicle{

	public Car() {
		System.out.println("in default constructor of car class..");
	}
	
	@Override
	public void move() {
		System.out.println("car is moving...");
		super.move();
	}

}
