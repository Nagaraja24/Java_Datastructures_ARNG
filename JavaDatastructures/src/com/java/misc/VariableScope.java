package com.java.misc;

public class VariableScope {

	int instanceValue = 10;

	static {
		System.out.println("Inside static block");
	}
	

	public VariableScope() {
		System.out.println("Inside constructor");
	}
	
	{
		int block = 20;
		System.out.println("Inside instance block");
	}

	public static void main(java.lang.String[] args) {
		int local = 15;

		VariableScope scope = new VariableScope();

		System.out.println(scope.instanceValue);

		// System.out.println(block); canot access block variable out side block
		
		
		{
			int x =10;   // x=10 scope start here
			
			{
				//int x=6;  compile time error
				int xy=15; // xy=15 start here and ends in the same block
			}
			
			int xy=40;  // x=10 scope ends here
		}

	}
	
	
}
