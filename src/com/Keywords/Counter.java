package com.Keywords;

public class Counter {

	static int counter = 0;
	int number  = 0;
	
	public Counter() {
		counter++;
		number++;
		
		System.out.println("Counter : " + counter);
		System.out.println("Number : " + number);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter counter = new Counter();
		Counter counter2 = new Counter();

		
	}

}
