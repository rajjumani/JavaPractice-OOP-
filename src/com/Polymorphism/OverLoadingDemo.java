package com.Polymorphism;

public class OverLoadingDemo {

	
	public int add(int a , int b) {
		return a+b;
	}
	
	public double add(double a  , double b) {
		return a+b;
	}
	
	public static void main(String[] args) {

		OverLoadingDemo demo = new OverLoadingDemo();
		System.out.println("integer method called : " + demo.add(3, 4));
		System.out.println("float method called : " + demo.add(4.5, 6.7) );
	}

}
