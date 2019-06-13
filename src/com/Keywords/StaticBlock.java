package com.Keywords;

public class StaticBlock {

	{
		System.out.println("in normal block of code..");
	}
	
	
	static{
		System.out.println("in static block of code...");
	}
	
	
	public static void main(String[] args) {
		
		
		StaticBlock block = new StaticBlock();
		StaticBlock block2 = new StaticBlock();
		
		

	}

}
