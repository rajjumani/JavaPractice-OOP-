package com.Interface;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caller1 caller1 = new Caller1();
		System.out.println("sqaure root of 4 : " + caller1.processInteger(4));
		
		Caller2 caller2 = new Caller2();
		System.out.println("Square of 4 : " + caller2.processInteger(4));

		//anonymous inner type : 
		/*CallMe callMe = new CallMe() {
			
			@Override
			public int processInteger(int a) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
*/		
		
	}

}
