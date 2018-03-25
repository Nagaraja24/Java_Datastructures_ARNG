package com.java.misc;

public class TestInterface {

	protected interface Yes {

		void methodOne();

		void methodTwo();

	}
	
	@FunctionalInterface
	interface Functional {
		
		void test();
		
	}

}

class Testing implements TestInterface.Yes {

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub

	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub

	}

}

 interface Hello {
	
	

}