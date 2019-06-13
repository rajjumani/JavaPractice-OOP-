package com.Polymorphism;

public class Mercedes extends Car{

	
	public Mercedes() {
		System.out.println("in default constructor of mercedes class..");
	}
	
	
	@Override
	public void move() {
		System.out.println("mercedes is moving...");
		super.move();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Mercedes();
		c.move();
		
		Mercedes mercedes = new Mercedes();
		mercedes.move();
		
	}

}
