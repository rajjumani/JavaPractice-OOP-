package com.Keywords;

public class NestedClass {


	class NestedInner{
		
		public void demo() {
			System.out.println("in demo method of nested inner class..");
		}
		
		
	}
	
	
	static class StaticInner{
		
		public void demo() {
			System.out.println("in demo method of static inner class..");
		}
		
	}
	
	public static void main(String[] args) {
		
		NestedClass class1 = new NestedClass();
		
		NestedInner inner = class1.new NestedInner();
		inner.demo();
		
		
		StaticInner inner2 = new NestedClass.StaticInner();
		inner2.demo();
		

	}

}
