package com.Inheritance;

public abstract class AbstractDemo {

	
	public void test() {
		System.out.println("in test method..");
	}
	
	public AbstractDemo() {
		System.out.println("in default constructor of demo class..");
	}
	
	public abstract void sayHello();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractDemo abstractDemo = new AbstractDemo() {
			
			@Override
			public void test() {
				// TODO Auto-generated method stub
				System.out.println("in virtual subclass test method..");
				super.test();
			}
			
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("hello");
			}
		};
		
		abstractDemo.sayHello();
		abstractDemo.test();
	}

}
