package com.java.misc;

public class DeadLockEx {

	// Its a deadlock programm
	public static void main(java.lang.String[] args) {

		try {
			Thread.currentThread().join();
			
			System.out.println("This statement will never execute");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
